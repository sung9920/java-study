package chapter03.ex11;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
//		
//		camera.setName("nikon");
//		camera.setPrice(400000);
//		camera.setCountSold(50);
//		camera.setCountStock(30);
		
		Goods camera = new Goods("nikon", 40000, 10, 20);
				
		camera.showInfo();
		
		camera.disCount(30);
	}
}
