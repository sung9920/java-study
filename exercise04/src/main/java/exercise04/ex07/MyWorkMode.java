package exercise04.ex07;

public class MyWorkMode extends WorkMode {
	
	@Override
	public void day(){
		System.out.println("낮에는 열심히 일하자!");
	}

	@Override
	public void service(String state) {
		if(state == "오후") { 
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		} else {
			super.service(state);
		}
	}
	
	
}
