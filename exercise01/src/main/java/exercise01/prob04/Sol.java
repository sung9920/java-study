package exercise01.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자: ");
		char n = scanner.next().charAt(0);
		scanner.close();
		
		if (n >= 65 && n <= 90)
			System.out.println("알파벳(대문자)입니다.");
		if (n >= 97 && n <= 122)
			System.out.println("알파벳(소문자)입니다.");
	}
}
