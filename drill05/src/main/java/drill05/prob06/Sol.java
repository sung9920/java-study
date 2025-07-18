package drill05.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for (int number : numbers) {
			if (number < min)
				min = number;
		}
		scanner.close();
		
		System.out.println("최솟값: " + min);
	}

}
