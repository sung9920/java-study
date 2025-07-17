package chapter01;

public class Ex14IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 82;
		
		if(score >= 90) {
			System.out.println("A");
		} else if(80 <= score) {
			System.out.println("B");
		} else if(70 <= score) {
			System.out.println("C");
		} else if(60 <= score) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
