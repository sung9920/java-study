package exercise01.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수[1 - ]: ");
		int n = scanner.nextInt();
		char alphabet = 'A';
		for(int i = 0; i < n; i++) { 
			System.out.print(alphabet+ " ");
			alphabet++;
		}
		scanner.close();
	}

}
