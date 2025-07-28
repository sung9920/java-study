package chapter04.wrapper;

public class BasicExample {

	public static void main(String[] args) {
		// 직접 생성하면 힙상에 객체가 존재한다.
		// 리터럴을 사용하면 JVM안에 Content Pool(상수풀)에서 관리한다.
		Integer i = new Integer(10); // deprecated
		Character c = new Character('A'); // deprecated
		Boolean b = new Boolean(true); // deprecated
		
		// Auto Boxing
		Integer j1 = 10;
		Integer j2 = 20;
		
		System.out.println(j1 != j2);

		// Auto Unboxing
		// int m = j1.intValue() + 10
		int m = j1 + 10;
		
		System.out.println(m == j2);
	}

}
