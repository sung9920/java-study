package chapter01;

public class Ex16SwitchExample01 {

	public static void main(String[] args) {
		
		char grade = 'C';
		
		switch (grade) {
		case 'A','B':
			System.out.println("잘했습니다."); break;
		case 'C','D' :
			System.out.println("노력했습니다."); break;
		case 'F' :
			System.out.println("다음 학기에 수강하세요.."); break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
}
