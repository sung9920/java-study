package chapter03.ex14;

public class Goods {

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

	public void showInfo(boolean summary) {
		if(summary) {
			System.out.println("상품이름:" + name + ", 가격: " + price);
		} else {
			showInfo();
		}
	}

	public void showInfo() {
		System.out.println(
			"상품이름:" + name +
			", 가격: " + price +
			", 재고량: " + countStock +
			", 판매량: " + countSold
		);
	}
	
	public void disCount(int discount) {
		price = price - ((price * discount) / 100);
		System.out.println("할인된가격: " + price);
	}

	public void sell() {
//		if(countStock > 0) {
//		countSold ++;
//		countStock --;
//		}
		sell(1);
	}

	public void sell(int quamtity) {
		if(countStock >= quamtity)
		{
		countSold += quamtity;
		countStock -= quamtity;
		}else System.out.println("재고가 부족합니다.");
	}
}
