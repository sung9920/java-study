package chapter03.ex10;

public class SwapTest02 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		System.out.println(i + ", " + j);
		
		swap(i, j);
		
		System.out.println(i + ", " + j);
		
	}
	
	public static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}