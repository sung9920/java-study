package chapter04.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorLegacyExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();

		vector.addElement("둘리");
		vector.addElement("마이콜");
		vector.addElement("또치");

		for (String v : vector)
			System.out.print(v + " ");

		System.out.println();

		vector.removeElementAt(1);

		// 순회2
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			String s = enumeration.nextElement();
			System.out.print(s + " ");
		}

		System.out.println();

		// 교체
		vector.set(1, "도우너");
		for (String v : vector)
		System.out.print(v + " ");
		
	}

}
