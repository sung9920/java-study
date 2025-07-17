package drill03.prob04;

/**
 * 
 * 문제 4. 세 수 중 최댓값 구하기
 * 
 * 변수 x, y, z 중 가장 큰 값을 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int x = 80, y = 58, z = 58;
		// 조건문을 활용해 최댓값 출력
		if (x>y && x>z) {
			System.out.println(x);
		} else if (y>x && y>z) {
			System.out.println(y);
		} else if (z>x && z>y) {
			System.out.println(z);
		} else {
			System.out.println("동일한 값이 존재합니다.");
		}
	}
}
