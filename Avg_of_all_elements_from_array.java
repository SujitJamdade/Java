package basic_data;

public class Avg_of_all_elements_from_array {

	public static void main(String args[]) {
		
		int a[] = {10, 20, 30, 40, 50, 60, 80, 70, 90, 100};
		int sum=0;
		
		for(int num=0; num<a.length; num++) {
			
			sum  = sum + a[num];
		}
		
		System.out.println("Total Sum = "+sum);
		System.out.println("Total element in array = "+a.length);
		
		System.out.println("Average of all elements from an array is : "+(sum/a.length));
	}
}

/**

Output : 

Total Sum = 550
Total element in array = 10
Average of all elements from an array is : 55

*/