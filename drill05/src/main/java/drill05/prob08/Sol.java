package drill05.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[6];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.print("중복 제거 후: " + numbers[0] + " ");

		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] == numbers[i])
					break;
				if (numbers[j] == numbers[i-1] && numbers[i] != numbers[i - 1])
					System.out.print(numbers[i] + " ");
			}
		}

		scanner.close();
	}
}
