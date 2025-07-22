package drill06.prob04;

public class Car {
	private String model;
	private int speed;
	
	public Car car;
	
	public void show(Car car) {
		System.out.println("Car[model=" + car.model + ", speed=" + car.speed + "]");
	}
	
	public void setCar(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
}
