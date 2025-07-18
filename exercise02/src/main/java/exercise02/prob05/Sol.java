package exercise02.prob05;

public class Sol {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 6 == 0 || i % 9 == 0 )
			System.out.println(i + " 짝");
			else System.out.println(i);
		}
	}

}
