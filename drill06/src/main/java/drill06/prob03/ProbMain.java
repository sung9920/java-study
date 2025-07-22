package drill06.prob03;


import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = null;
		int score = 0;

		// 학생1
		System.out.print("학생1: ");
		name = scanner.next();
		score = scanner.nextInt();
		Student student1 = new Student();
		student1.setStudent(name, score);
		
		// 학생2
		System.out.print("학생2: ");
		name = scanner.next();
		score = scanner.nextInt();
		Student student2 = new Student();
		student2.setStudent(name, score);
		
		if(student1.getScore()>student2.getScore()) {
			System.out.println(student1.getName() + "의 점수가 더 높습니다." );
		} else {
			System.out.println(student2.getName() + "의 점수가 더 높습니다." );
		}
		scanner.close();
		
	}

}
