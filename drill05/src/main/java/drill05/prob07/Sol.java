package drill05.prob07;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		
		System.out.print("배열:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.print("찾을값:");
		int target = scanner.nextInt();
		
		scanner.close();
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == target) {
				System.out.println(target + "는 인덱스" + j + "에 있음"); break;
			}
		}
		if (numbers[numbers.length-1] != target)
			System.out.println(target + "는 인덱스 -1에 있음");
	}

}
