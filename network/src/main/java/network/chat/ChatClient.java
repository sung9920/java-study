package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";
	
	public static void main(String[] args) {
		Scanner scanner = null;
		Socket socket = null;
		
		try {
			scanner = new Scanner(System.in, "MS949");
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress(SERVER_IP, ChatServer.PORT));
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			
			System.out.print("닉네임>>" );
			String nickname = scanner.nextLine();
			pw.println("join:" + nickname);
			
			String response = br.readLine();
			if(response=="join:ok") {
				System.out.println("채팅방에 입장했습니다.");
			} else {
				System.out.println("채팅방 입장에 실패했습니다.");
			}
			
			new ChatClientThread(br).start();
			
			while(true) {
//				System.out.print(">> ");
				String line = scanner.nextLine();
			
				if("quit".equals(line)) {
					pw.println("quit");
					break;
				} else {
					pw.println("message:" + line);
				}
			}
			
		} catch(IOException e) {
			log("error: " + e);
		} finally {
			try {
				if(socket != null && !socket.isClosed()) {
					socket.close();
				}
				if(scanner != null) {
					scanner.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void log(String message) {
		System.out.println("[Echo Client] " + message);
	}
}