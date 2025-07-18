package exercise02.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.print("입력: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		scanner.close();		
				
		for (int number : numbers) {
			if (number < min)
				min = number;
		}
		
		for (int number : numbers) {
			if (number > max)
				max = number;
		}
		System.out.println("최대-최소 차이: " + (max-min));
	}

}
