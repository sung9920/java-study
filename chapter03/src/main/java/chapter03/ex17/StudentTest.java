package chapter03.ex17;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("비트");
		s1.setSchool("Java School");
		
		Person p1 = s1; // Upcasting (암시적, Implicity)
		System.out.println(p1.getName());
		
		Person p2 = new Student(); // Upcasting, 다형성
		p2.setName("캠프");
		System.out.println(p2.getName());
		
		Student s2 = (Student) p2; // Downcasting (명시적, Explicity)
		s2.setSchool("Spring School"); // 또는
		((Student)p2).setSchool("Spring School"); // Downcasting (명시적, Explicity)
		System.out.println(s2.getSchool());
	}

}
