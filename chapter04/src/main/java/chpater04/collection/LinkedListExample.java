package chpater04.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("또치");
		
		// 순회1
		
		for (String name : list) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		// 삭제
		list.remove(1);
		
		//순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 교체
		list.set(1, "도우너");
		
		// 순회3
		for(String s : list) {
			System.out.print(s + " ");
		}
	}

}
