package exercise01.prob03;

public class Sol {

	public static void main(String[] args) {

		int total = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) total++;
		}
		System.out.println("5의 배수 개수: " + total);
	}

}
