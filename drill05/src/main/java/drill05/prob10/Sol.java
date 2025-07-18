package drill05.prob10;

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
		
		for (int i = 0; i < numbers.length/2; i++) {
			temp = numbers[i];
			numbers[i] = numbers[numbers.length-1-i];
			numbers[numbers.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(numbers));
		scanner.close();		
	}

}
