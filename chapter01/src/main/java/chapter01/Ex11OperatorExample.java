package chapter01;

public class Ex11OperatorExample {

	public static void main(String[] args) {
		int radius = 5;
		
		System.out.println("반지름: " + radius);
        System.out.println("원의 넓이: " + calculateCircleArea(radius));
	}

	public static double calculateCircleArea(int readius) {
		final double PI = 3.14;
		double area = readius * readius * PI;
		return area;
	}
}
