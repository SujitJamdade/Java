package basic_data;

public class Summation_of_elements_in_array {
	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int num = 0; num<a.length; num++) {
	
			sum = sum + a[num];
			
		}

		System.out.println("Summation of all numbers in array is : "+sum);
	}	
}

/**

Output :

Summation of all numbers in array is : 55

*/