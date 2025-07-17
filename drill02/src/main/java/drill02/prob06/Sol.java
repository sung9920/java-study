package drill02.prob06;

/**
 * 
 * 문제 6: 변수 타입 오류 찾기
 * 
 * 문제: 오류 발생 줄에 그 이유를 주석으로 달고 바르게 고쳐 컴파일 및 실행하기
 * 
 */
public class Sol {

	public static void main(String[] args) {
		int count = 3; // int형은 문자, 문자열 말고 정수만 들어감
		boolean isOn = true; // boolean형은 true,false 둘 중에 하나만 들어가야함
		char c = 'A'; // char형은 값을 넣을때 "" 말고 ''
		float f = 3.14f; // float형은 입력값 끝에 f명시
		String name = "Alice";
		
		System.out.println(count);
		System.out.println(isOn);
		System.out.println(c);
		System.out.println(f);
		System.out.println(name);		
	}

}
