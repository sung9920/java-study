package drill05.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++)
		a[i] = scanner.nextInt();
		
		System.out.println(a[0]+a[1]);	
		scanner.close();
	}		
}
