package chapter01;

public class Ex15NestedIfExample {

	public static void main(String[] args) {
		int score = 92;
		if(score >= 80) {
			if(score >= 90) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}
