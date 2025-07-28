package exercise04.ex08;

public abstract class Shape {
	private double width;
	private double height;
	
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
