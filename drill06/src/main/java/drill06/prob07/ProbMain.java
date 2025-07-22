package drill06.prob07;

public class ProbMain {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("서울");
		address.setStreet("강남대로");
		
		Customer customer = new Customer();
		customer.setName("둘리");
		customer.setAddress(address);
		
		System.out.println("고객명: " + customer.getName());
		System.out.println("도시: " + address.getCity());
		System.out.println("도로명: " + address.getStreet());
	}
}
