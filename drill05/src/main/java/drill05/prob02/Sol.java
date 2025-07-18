package drill05.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[6];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			if(numbers[i]%2==0)
			System.out.print(numbers[i] + " ");
		}
		
		scanner.close();
	}
}
