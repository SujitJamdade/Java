package basic_data;

public class Max_Number_In_Array {
	
	public static void main(String args[]) {
		
		int a[] = {10, 20, 50, 40, 200, 84, 70, 100};
		int maximum = a [0];
		
		for (int num =  1; num<a.length; num++) {
			
			if (a[num] > maximum) {
			
				maximum = a[num];
				
			}
			
		}
		System.out.println("Maximum number is "+maximum);
				
	}

}

/**

Output :
	
Maximum number is 200

*/