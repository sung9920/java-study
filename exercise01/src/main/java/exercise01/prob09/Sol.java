package exercise01.prob09;

public class Sol {

	public static void main(String[] args) {
		char text[] = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', ' ', 't', 'o', ' ', 'l', 'e', 'a', 'r',
				'n' };
		int blank = 0;
		
		// 공백 문자 바꾸기
		for (int i = 0; i < text.length; i++) {
			if (text[i] == ' ') {
				text[i] = '-';
				blank++;
			}
		}
		
		System.out.print("변환: ");
		
		// 수정된 배열 원소 및 개수 출력
		for (int i = 0; i < text.length; i++)
			System.out.print(text[i]);

		System.out.println("\n바뀐 공백 수: " + blank);
	}
}
