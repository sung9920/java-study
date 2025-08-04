package network.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {
	public static final int PORT = 6000;
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			// 1. Server Socket 생성
			serverSocket = new ServerSocket();
			
			// 1.1 FIN_WAIT2 -> TIME_WAIT 상태에서 소켓 포트 할당이 가능하도록 하기 위해
			serverSocket.setReuseAddress(true);
			
			// 2. 바인딩(binding)
			// socket에 InetSocketAddress[InetAddress(IP Address) + port]를 바인딩 한다.
			// IPAddress: 0.0.0.0 :특정 호스트 IP를 바인딩 하지 않는다.
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			
			// 3. accept
			Socket socket = serverSocket.accept(); // blocking
			
			try {
				InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
				int remotePort = inetRemoteSocketAddress.getPort();
				System.out.println("[server] connected by client[" + remoteHostAddress + ":" + remotePort + "]");
				
				// 4. IOStream 받아오기
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				while(true) {
					
					// 5. 데이터 읽기
					byte[] buffer = new byte[256];
					int readByteCount = is.read(buffer); // blocking
					
					if(readByteCount == -1) {
						// close by client
						System.out.println("[server] closed by client");
						break;
					}
					
					String data = new String(buffer, 0, readByteCount, "UTF-8");
					System.out.println("[server] received: " + data);
					
					// 6. 데이터 쓰기
					// SO_TIMEOUT 테스트
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					os.write(data.getBytes("utf-8"));
				}
			} catch(SocketException e) {
				System.out.println("[server] Socket Exception: " + e);
			} catch(IOException e) {
				System.out.println("[server] error: " + e);
			} finally {
				try {
					if(socket != null && !socket.isClosed()) {
						socket.close();
					}
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			System.out.println("[server] error: " + e);
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}