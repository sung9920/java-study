package drill06.prob08;

import java.util.Scanner;

import drill06.prob04.Car;

public class ProbMain {

	public static void main(String[] args) {
		Score[] scores = new Score[5];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("점수 " + (i+1) + ": ");
			scores[i] = scanner.nextInt();
			cars[i] = new Car();
		}
		
		scanner.close();
	}

}
