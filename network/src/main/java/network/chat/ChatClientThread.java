package network.chat;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientThread extends Thread {
	private BufferedReader br;

	public ChatClientThread(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String message = br.readLine();
				if (message == null) {
					System.out.println("서버와의 연결이 종료되었습니다.");
					break;
				}
				System.out.println(message);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
