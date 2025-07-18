package drill05.prob09;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		temp = numbers[0];
		numbers[0] = numbers[numbers.length-1];
		numbers[numbers.length-1] = temp;
				
		System.out.println("교환 후: " + Arrays.toString(numbers));
		scanner.close();
	}
}
