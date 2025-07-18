package exercise02.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열: ");
		String text = scanner.nextLine();
		scanner.close();

		/* 코드 작성 */
//		for(int i = 0; i < text.length(); i++) {
//			char c = text.charAt(i);
//			System.out.println(c);
//		}
		
		char[] arr = text.toCharArray();
		
		for(int i = 1; i < arr.length+1; i++) {
			for( int j = 0; j < i; j++) {
			System.out.print(arr[j]);
			}
			System.out.println("");
		}
	}
}
