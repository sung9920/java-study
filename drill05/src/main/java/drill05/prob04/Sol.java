package drill05.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[4];
		double avg = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			avg += numbers[i];
		}
		System.out.println("평균: " + avg / numbers.length );
		scanner.close();
	}

}
