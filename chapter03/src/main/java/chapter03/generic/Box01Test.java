package chapter03.generic;

public class Box01Test {

	public static void main(String[] args) {
		Box01 box = new Box01("hello");
		System.out.print(box.getValue());
		
		box.setValue(" ");
		System.out.print(box.getValue());
		
		box.setValue("world");
		System.out.print(box.getValue());
	}
	
}
