package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		double highest = 0;
		double lowest = Double.POSITIVE_INFINITY;
		double grandtotal = 0;
		String biggest = "hi";
		String smallest = "hi";
		// c represents the "6" which is how many items the store possesses
		double total = 0;
		// total represents the double value of the number of each items * its respective price
		String[] product = new String[c];
		// creates a new string array with 6 spots
		Double [] totalprice = new Double[5];
		Double[] price = new Double[c];
		for(int i = 0; i < c; i++) {
			//for loop that loops 6 times
			product[i] = scan.next();
			// puts the fruits in the  product array
			price[i] = scan.nextDouble();
		}	// puts the prices in the double array
		
		int num_ofcust =scan.nextInt();
		String [] people = new String[num_ofcust];
		// creates a string array to store the customer names
			for (int i =0; i < num_ofcust; i++) { //loops 3 times, has JUST the names
				people[i] = scan.next();
				people[i] += " " + scan.next() + " ";
				int totalquant = scan.nextInt();
				//System.out.println(num_ofcust);
				//System.out.println(product[1]);
				for (int j=0; j <totalquant; j++) {
					int quant_per_person = scan.nextInt();
					String fruit = scan.next();
					for (int k=0; k < c; k++) {
						if (fruit.equals(product[k])) {
							//int yes = k;
							total += (quant_per_person * price[k]);
							
							//System.out.println("reached");
						}//System.out.println(people[i]+ total + " hi");
					} //System.out.println(total);
					
				}// System.out.println(total);
				totalprice[i] = total;
				//System.out.println("hi" + totalprice[2]);
				grandtotal += total;
				if (total > highest ) {
					highest = total;
					
				} 
				if (total < lowest) {
					lowest = total;
				}
				total = 0;
				
			
			} double avg = grandtotal / num_ofcust;
			for (int i =0; i <num_ofcust; i++) {
				if (totalprice[i].equals(highest)) {
					biggest = (people[i]);
				}
				if (totalprice[i].equals(lowest)) {
					smallest = (people[i]);
				}
			}
			;
			
			//System.out.println(avg);
			
			//System.out.println("highest" + String.format("%.2f", highest));
			//System.out.println(totalprice[0] + biggest);
			System.out.println("Biggest: " + biggest + "(" + String.format("%.2f", highest) + ")");
			System.out.println("Smallest: " + smallest + "(" + String.format("%.2f", lowest) + ")");
			System.out.println("Average: " + (String.format("%.2f", avg)));
	}		
}