package drill05.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			System.out.print(numbers[i] + " ");
		}
		
		
		scanner.close();
	}
}
