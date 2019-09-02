package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		String[] product = new String[c];
		Double[] price = new Double[c];
		int[]cust_count = new int[c];
		int[]product_count = new int[c];
		for(int i = 0; i < c; i++) {
			//for loop that loops 6 times
			product[i] = scan.next();
			// puts the fruits in the  product array
			price[i] = scan.nextDouble();
		}	// puts the 
		
		int num_ofcust =scan.nextInt();
		for (int i =0; i < num_ofcust; i++) {
			String firstname = scan.next();
			String lastname =scan.next();
			int productsbought = scan.nextInt();
			
			for (int j = 0; j < productsbought; j++) {
				int num = scan.nextInt();
				String fruit = scan.next();
				
				for (int k = 0; k < c; k++) {
					if (fruit.equals(product[k])) {
						cust_count[k] = cust_count[k] + 1;
						product_count[k] = product_count[k] + num;
						
					}
					
				}
				
	
			} 	
			
		}
		 for (int l=0; l < c; l++) {
			 if (cust_count[l]==0) {
				 System.out.println("No customers bought " + product[l]);
			 } else {
			 System.out.println(cust_count[l] + " customers bought " + product_count[l] + " "+ product[l]);
		 }
		 }
		
		
	}
}
