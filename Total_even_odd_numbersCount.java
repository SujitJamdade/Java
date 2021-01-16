package basic_data;

public class Total_even_odd_numbersCount {

	public static void main(String args[]) {
		
		int a[] = {1, 5, 6, 8, 9, 7, 45, 85,87,52};
		int count = 0;
		
		for (int num = 0; num<a.length; num++) {
			
			if (a[num] % 2 == 0) {
				
				count++;
			}
			
		}
		
		System.out.println("Total Even Number : "+count);
		System.out.println("Total Odd Number : "+(a.length - count));
		
	}
}

/**

Output : 

Total Even Number : 3
Total Odd Number : 7

*/