package chapter03.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("nikon", 400000, 10, 20);
		camera.showInfo();
		camera.showInfo(true);
		
		camera.sell();
		camera.showInfo();
		
		camera.sell(4);
		camera.showInfo(false);
		
//		Goods tv = new Goods("TV", 200000, 100, 200);
//		tv.showInfo();
		
//		camera.disCount(30);
	}
}
