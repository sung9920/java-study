package exercise01.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수[2 - ]: ");
		int n = scanner.nextInt();
		int sum = 0;
		
		for ( int i = 1; i < n; i++ ) {
			if(n % i == 0)
			sum += i;
		}
		if(sum == n)
		System.out.println(n + "는(은) 완전수입니다.");
		scanner.close();
	}

}
