package chapter04.collection;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new TreeMap<>();
		
		scoreMap.put("kim", 90);
		scoreMap.put("ahn", 100);
		scoreMap.put("park", 80);
		
		System.out.println("키가 정렬된 Map: " + scoreMap);
	}

}
