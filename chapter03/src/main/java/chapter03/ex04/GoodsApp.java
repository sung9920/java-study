package chapter03.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountSold(50);
		camera.setCountStock(30);
		
		camera.showInfo();
		
		System.out.println("할인된가격: " + camera.disCount(10));
	}
}
