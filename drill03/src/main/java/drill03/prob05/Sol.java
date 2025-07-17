package drill03.prob05;

/**
 * 문제 5. 알파벳 대/소문자 구분
 * 
 * 변수 ch가 대문자(A - Z)이면 "대문자",
 * 소문자(a - z)이면 "소문자"를 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		char ch = 'h';
		// if 조건에 문자 범위 사용
		
		if ('A'<= ch && ch <= 'Z') {
			System.out.println("대문자");
		} else if ('a'<=ch && ch <= 'z') {
			System.out.println("소문자");
		} else {
			System.out.println("대문자,소문자 둘다 해당하지 않음");
		}
	}

}
