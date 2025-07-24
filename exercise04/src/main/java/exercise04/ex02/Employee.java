package exercise04.ex02;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void getInformation() {
		System.out.print("이름: " + getName() + "  연봉: " + getSalary());
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

}
