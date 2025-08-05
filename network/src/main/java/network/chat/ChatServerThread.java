package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class ChatServerThread extends Thread {
	private String nickname;
	private Socket socket;
	List<Writer> listWriters;

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		try {
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remotePort = inetRemoteSocketAddress.getPort();
			ChatServer.log("connected by client[" + remoteHostAddress + ":" + remotePort + "]");

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));

			while (true) {
				String data = br.readLine();

				if (data == null) {
					ChatServer.log("closed by client");
					doQuit(pw);
					break;
				}

				String[] tokens = data.split(":");

				if ("join".equals(tokens[0])) {
					doJoin(tokens[1], pw);
				} else if ("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				} else if ("quit".equals(tokens[0])) {
					doQuit(pw);
				} else {
					ChatServer.log("에러:알수 없는 요청(" + tokens[0] + ")");
				}

			}
		} catch (SocketException e) {
			ChatServer.log("Socket Exception: " + e);
		} catch (IOException e) {
			ChatServer.log("error: " + e);
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void doJoin(String nickName, PrintWriter pw) {
		this.nickname = nickName;

		String data = nickName + "님이 참여하였습니다.";
		broadcast(data);

		/* writer pool에 저장 */
		addWriter(pw);

		// ack
		pw.println("join:ok");
		pw.flush();
	}

	private void addWriter(PrintWriter pw) {
		synchronized (listWriters) {
			listWriters.add(pw);
		}
	}

	private void broadcast(String data) {
		synchronized (listWriters) {

			for (Writer writer : listWriters) {
				PrintWriter pw = (PrintWriter) writer;
				pw.println(data);
				pw.flush();
			}
		}
	}

	private void doQuit(PrintWriter pw) {
		removeWriter(pw);

		String data = nickname + "님이 퇴장 하였습니다.";
		broadcast(data);
	}

	private void removeWriter(PrintWriter pw) {
		synchronized (listWriters) {
			listWriters.remove(pw);
		}
	}

	private void doMessage(String message) {
		String data = nickname +">> " + message;
		broadcast(data);
	}

}