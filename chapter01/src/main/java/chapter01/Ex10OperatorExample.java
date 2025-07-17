package chapter01;

public class Ex10OperatorExample {
	public static void main(String[] args) {
		final int TIME = 500; // 총 시간(초)
		
		int hour, minute, second;
		
		hour = TIME / 3600;
		minute = (TIME / 60) % 60;// ((TIME % 3600)) / 60;
		second = TIME % 60;
		
		System.out.print(TIME + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
	}
}
