package chapter03.ex18;

public class PolymorphismTest {
	static class Animal {
		private String specise;

		public void sound() {
			System.out.println("구현불능");
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

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Dog();
		
		a1.sound();
		a2.sound();
	}
}
