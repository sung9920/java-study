package chapter03.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountSold(50);
		camera.setCountStock(30);
		
		Goods tv = new Goods("TV", 200000, 100, 200);
				
		camera.showInfo();
		tv.showInfo();
		
//		camera.disCount(30);
	}
}
