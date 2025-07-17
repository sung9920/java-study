package chapter01;

public class Ex19PowerOfTwo {

	// 2의 10승 값을 while loop 로 구하기
	public static void main(String[] args) {

		int i = 0;
		int result = 1;

		while (i < 10) {
			result *= 2;
			i++;
		}
		System.out.println(result);
	}
}
