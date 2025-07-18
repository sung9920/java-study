package exercise01.prob10;

import java.util.Arrays;

public class Sol {

	public static void main(String[] args) {
		int data[] = {5, 9, 3, 8, 60, 20, 1};
		int count = data.length;
		int temp;
		
		System.out.println("Before: " + Arrays.toString(data));

		for(int i = 0; i < count-1; i++){
			for(int j = 0; j < count -i -1; j++) {
				if(data[j] < data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
				System.out.println(Arrays.toString(data));
			}
		}

		System.out.println("After: " + Arrays.toString(data));
	}
}
	
