package chapter04.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "java", "banana", "melon");
		
		Set<String> uniqueWords = new HashSet<>(list);
		System.out.println(uniqueWords);
		
		Set<String> uniqueWordSorted = new TreeSet(list);
		System.out.println(uniqueWordSorted);
	}

}
