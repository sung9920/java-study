package exercise01.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수: ");
		int n = scanner.nextInt();
		
		if(n < 0) System.out.println("절댓값: " + -n);
		else System.out.println("절댓값: " + n);
		scanner.close();
	}

}
