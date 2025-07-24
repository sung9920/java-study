package exercise04.ex04;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function.equals("앱")) {
			System.out.println("앱 실행");
			return;
		}

		super.execute(function);
	}

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	
}
