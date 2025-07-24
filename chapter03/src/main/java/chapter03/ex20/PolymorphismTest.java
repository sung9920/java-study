package chapter03.ex20;

public class PolymorphismTest {
	static interface Soundable {
		void sound();
	}
	
	static abstract class Animal implements Soundable{
		private String specise;

//		public abstract void sound();

		public String getSpecise() {
			return specise;
		}

		public void setSpecise(String specise) {
			this.specise = specise;
		}
	}

	
	static class Dog extends Animal {
		@Override
		public void sound() {
			System.out.println("멍멍");
		}
	}

	
	static class Sparrow extends Animal {
		@Override
		public void sound() {
			System.out.println("짹짹");
		}
	}
	
	// 객체지향 설계 위반: "is-a 관계의 오용" 또는 "불필요한 상속”
//	static class AlarmBell extends Animal {
//
//		@Override
//		public void sound() {
//			System.out.println("ALARM!!");
//		}
//	}
	
	static class AlarmBell implements Soundable {
		@Override
		public void sound() {
			System.out.println("ALARM!!");
		}
	}
	
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Sparrow();
		
		a1.sound(); //멍멍
		a2.sound(); //짹짹
		
		// 객체지향 설계 위반: "is-a 관계의 오용" 또는 "불필요한 상속”
		// Animal a3 = new AlarmBell();
		// a3.sound(); //ALARM!!
		Soundable soundable = new AlarmBell();
		soundable.sound();
	}
}
