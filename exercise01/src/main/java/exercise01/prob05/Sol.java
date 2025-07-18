package exercise01.prob05;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수[1 - ]: ");
		int n = scanner.nextInt();
		
		n = n / 100 + (n % 100) / 10 + (n % 10);
		System.out.println("자리수 합: " + n);
		scanner.close();
	}

}
