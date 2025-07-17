package chapter01;

public class Ex03VariableConstant {
	public static void main(String[] args) {
		// 원시타입(기본타입, primitive type)
		short i = 10;
		int age = 30;
		long l = 12322456789L;
		
		float pi = 3.14f;
		double height = 126.5;
		
		boolean isStudent = true;
		
		char garde = 'A';
		byte b = 20;
		
		System.out.println(i);
		System.out.println(age);
		System.out.println(l);
		System.out.println(pi);
		System.out.println(height);
		System.out.println(isStudent);
		System.out.println(garde);
		System.out.println(b);
		
		// Class
		String name = "박성철";
		System.out.println(name);
		
		// 상수
		final int MAX_USER =  10;
		final double PI = 3.141592;
		
		// 에러: 한 번이상 대입을 못한다.
//		MAX_USER = 2;
		System.out.println(PI);
		
		int radius = 10;
		System.out.println(radius * radius * PI);
	}
}
