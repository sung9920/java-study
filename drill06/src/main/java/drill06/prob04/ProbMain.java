package drill06.prob04;

import java.util.Scanner;

import drill06.prob03.Student;

public class ProbMain {

	public static void main(String[] args) {
		Car[] cars = new Car[3];

		Scanner scanner = new Scanner(System.in);

		String model = null;
		int speed = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("자동차"+(i+1) + ": ");
			model = scanner.next();
			speed = scanner.nextInt();
			cars[i] = new Car();
			cars[i].setCar(model, speed);
		}
		
		for ( int i = 0; i < 3; i++) {
			cars[i].show(cars[i]);
		}
	
		
		scanner.close();
	}

}
