package chapter01;

public class Ex17SwitchExample02 {

	public static void main(String[] args) {
		
		int score = 78;
		int grade = score / 10;
		switch (grade) {
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default:
			System.out.println("F"); break;
		}
	}
}
