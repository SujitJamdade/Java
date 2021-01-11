package basic_data;

public class Identify_Even_Odd {
	
	public static void main(String args[]) {
		
		int num = 15;
		
		// Approach 1 
		/*
		if (num % 2 == 0) {
			System.out.println(num+" is even number.");
		}
		else {
			System.out.println(num+" is odd number.");
		}
		*/
		
		// Approach 2
		/*
		if ((num & 1) == 0) {
			System.out.println(num+" is even number.");
		}
		else {
			System.out.println(num+" is odd number.");
		}
		*/
		
		// Approach 3
		
		if((( num / 2) * num ) == num ) {
			System.out.println(num+" is even number.");
		}
		else {
			System.out.println(num+" is odd number.");
		}
	
	}

}
