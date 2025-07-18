package exercise02.prob03;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수[1 - ]: ");
		
		int n = scanner.nextInt();
		int total = 0;
		int i = (n % 2 == 0 ? 0 : 1);
		
		for (; i <= n; i += 2) {
		if(n % 2 == 0) total += i;
		else total += i;
	
		}
		
		scanner.close();
		
		System.out.println("결과값: " + total);
	}

}
