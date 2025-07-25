package chapter03.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		camera.countSold = 10;
		camera.countStock = 20;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		System.out.println(camera.countStock);
		System.out.println(camera.countStock);
	}

}