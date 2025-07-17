package chapter01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("이름을 입력하세요: ");
//		String name = scanner.nextLine();
//		System.out.println(name);
		
		System.out.println("이름,생년을 순서대로 입력하세요: ");
		String name = scanner.next();
		int year = scanner.nextInt();
		
		System.out.println(name + "님");
		System.out.println("태어난 년도는" + year + "년 입니다.");
		
		scanner.close();
	}

}
