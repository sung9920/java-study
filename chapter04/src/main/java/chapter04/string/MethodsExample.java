package chapter04.string;

public class MethodsExample {

	public static void main(String[] args) {
		// 1. length() 문자열.length(), 배열.length, list.size()
		String s1 = "Hello";
		System.out.println("length():" + s1.length());
		
		// 2. charAt()
		String s2 = "Java";
		System.out.println("charAt(2):" + s2.charAt(2));
		
		// 3. substring()
		String s3 = "Hello World";
		System.out.println("substring(0, 5):" + s3.substring(0, 5));
		
		// 4. equals() / equalsIgnoreCase()
		String a = "apple";
		String b = "Apple";
		System.out.println("eqauls():" + a.equals(b));
		System.out.println("equalsIgnoreCase():" + a.equalsIgnoreCase(b));
		
		// 5. indexOf() / cotains()
		String s4 = "banana";
		System.out.println("indexOf(\"na\"):" + s4.indexOf("na"));
		System.out.println("contains(\"ba\"):" + s4.contains("ba"));
		
		// 6. trim
		String s5 = "    h e l l o    ";
		System.out.println("trim(): " + s5.trim());
		
		// 7. replace 
		String s6 = "a-b-c-d";
		System.out.println("replace(): " + s6.replace("-", ":")); // "a:b:c:d"
		
		
		// 8. toLowerCase() / toUpperCase()
		String s7 = "JaVa";
		System.out.println("toLoserCase(): " + s7.toLowerCase());
		System.out.println("toUpperCase(): " + s7.toUpperCase());
		
		// 9. split(String regex)
		String s8 = "red,green,blue";
		String[] colors = s8.split(",");
		System.out.println("split(): ");
		for(String color : colors) { 
			System.out.println("- " + color);
		}
		
		// 10. isEmpty()
		String emptyStr = "";
		String nonEmptyStr = "text";
		System.out.println("isEmpty() on emptyStr: " + emptyStr.isEmpty());
		System.out.println("isEmpty() on nonEmptyStr: " + nonEmptyStr.isEmpty());
		
		
		// 11. valueOf(...)
		int num = 10;
		boolean flag = true;
		System.out.println("valueOf(int): " + String.valueOf(num));
		System.out.println("valueOf(boolean): " + String.valueOf(flag)); 
		
		
	}

}
