package exercise02.prob05;

public class Sol {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			String a = String.valueOf(i);
	
			System.out.print(i);
			
			for (int j = 0; j < a.length(); j++) {
				
				if (a.charAt(j) == '3')
					System.out.print(" 짝");
				
				if (a.charAt(j) == '6')
					System.out.print(" 짝");
				
				if (a.charAt(j) == '9')
					System.out.print(" 짝");
			}
			
			System.out.println("");
		}
	}

}
