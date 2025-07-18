package exercise01.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		System.out.print("입력: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < MONEYS.length; i++) {
			System.out.println(MONEYS[i] + "원 : " + n / MONEYS[i]+ "개");
			n %= MONEYS[i];
		}
		
		scanner.close();
	}

}
