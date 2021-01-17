package basic_data;

public class Second_max_number {
	
	public static void main(String args[]) {
		
		int a[] = {10, 20, 15, 40, 45, 5, 50, 35, 25,30};
		int c;
		
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j<a.length; j++) {
				
				if (a[j]>a[i]) {
				
					c = a[i];
					a[i] = a[j];
					a[j] = c;

				}
			}
		}
		
		System.out.println("Max number = "+a[a.length-1]);
		System.out.println("Second Max Number = "+a[a.length-2]);
		
		
	}

}

/**

Output :

Max number = 50
Second Max Number = 45

*/