package chapter03.ex12;

public class Goods {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	private String name;
	private int price;
	private int countSold;
	private int countStock;

	public Goods() {

	}

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
