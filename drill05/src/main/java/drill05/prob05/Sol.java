package drill05.prob05;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for (int number : numbers) {
			if (number > max)
				max = number;
		}
		scanner.close();
		
		System.out.println("최댓값: " + max);
	}
}
