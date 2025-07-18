package drill05.prob03;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[4];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		scanner.close();
	}
}
