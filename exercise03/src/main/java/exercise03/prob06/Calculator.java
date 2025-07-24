package exercise03.prob06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();
			
			if("quit".equals(expression)) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			
			if(tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);
			
			switch(tokens[1]) {
				case "+": {
					Add add = new Add();
					add.setValue(lValue, rValue);
					System.out.println(add.claculate());
					break;
				}
				case "-" : {
					Sub sub = new Sub();
					sub.setValue(lValue, rValue);
					System.out.println(sub.claculate());
					break;
				}
				case "*" : {
					Mul mul = new Mul();
					mul.setValue(lValue, rValue);
					System.out.println(mul.claculate());
					break;					
				}
				case "/" : {
					Div div = new Div();
					div.setValue(lValue, rValue);
					System.out.println(div.claculate());
					break;
				}
				default :  {
					System.out.println(">> 알 수 없는 연산입니다.");
				}
			}
		}
		
		scanner.close();
	}

}
