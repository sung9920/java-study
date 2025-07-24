package exercise04.ex03;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return radius*radius*3.14;
	}

}
