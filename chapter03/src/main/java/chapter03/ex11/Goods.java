package chapter03.ex11;

public class Goods {

	private String name;
	private int price;
	private int countSold;
	private int countStock;
	
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("재고량: " + countStock);
		System.out.println("판매량: " + countSold);
	}
	
	public void disCount(int discount) {
		price = price - ((price * discount) / 100);
		System.out.println("할인된가격: " + price);
	}
}
