package drill06.prob08;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Score[] scores = new Score[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("점수 " + (i+1) + ": ");
			int score = scanner.nextInt();
			scores[i] = new Score();
			scores[i].setValue(score);
		}
		scanner.close();

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scores[i].getValue();
		}

		double average = (double) sum / scores.length;
		System.out.println("평균 점수: " + average);
	}

}
