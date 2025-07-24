package chapter03.ex19;

public class PolymorphismTest {
	static abstract class Animal {
		private String specise;

		public abstract void sound();

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

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Dog();
		
		a1.sound();
		a2.sound();
	}
}
