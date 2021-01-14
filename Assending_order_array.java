package basic_data;

public class Assending_order_array {
	
	public static void main(String args[]) {
		
		int a[] = {10, 20, 15, 40, 45, 5, 50, 35, 25,30};
		int c ;
		for (int i=0; i<a.length; i++) {
			
			for (int j =0; j<a.length; j++) {
				
				if (a[j]>a[i]) {
					c = a[i];
					a[i]=a[j];
					a[j]=c;
					
				}
			}
		}
		
		for (int num=0; num<a.length; num++) {
			
			System.out.print(a[num]+", ");
		}
	}

}


/**
 
Output : 

5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 
 
*/
