package exercise03.prob01;

public class Goods {
	private String name;
	private int price;
	private int stock;
	
	public Goods(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void printInfo(Goods g) {
		System.out.println(
				g.name + "(가격:" + 
				g.price + "원)이 " + 
				g.stock + "개 입고 되었습니다.");
	}
}