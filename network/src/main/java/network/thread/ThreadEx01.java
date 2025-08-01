package network.thread;

public class ThreadEx01 {

	public static void main(String[] args) {
		new DigitThread().start();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
