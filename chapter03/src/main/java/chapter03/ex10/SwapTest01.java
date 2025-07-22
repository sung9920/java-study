package chapter03.ex10;

public class SwapTest01 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int temp;
		System.out.println(i + ", " + j);
		
		//swap
		temp = i;
		i = j;
		j = temp;
		System.out.println(i + ", " + j);
		
	}

}
