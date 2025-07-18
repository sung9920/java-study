package exercise02.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 섭씨: ");
		int startC = scanner.nextInt();

		System.out.print("끝 섭씨: ");
		int endC = scanner.nextInt();

		System.out.print("증가 간격: ");
		int step = scanner.nextInt();
		
		scanner.close();

		System.out.println("C\tF");
		for(; startC <= endC; startC += step ) {
			System.out.println(startC+"\t"+(double)(startC * 9 / 5 + 32));
		}
	}

}
