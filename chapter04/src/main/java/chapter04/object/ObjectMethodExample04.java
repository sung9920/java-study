package chapter04.object;

import java.util.HashSet;

public class ObjectMethodExample04 {

	public static void main(String[] args) {
		HashSet<Rect> set = new HashSet<>();
		
		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);
		
		set.add(r1);
		set.add(r2);
		
		System.out.println(set);
	}

}
