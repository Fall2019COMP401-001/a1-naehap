package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();

		//String[] first= new String[c];
		//char first = scan.next().charAt(0);
		//char second = scan.next().charAt(0);
		//int number = scan
		// System.out.println(first);
		//System.out.println(first + "." + scan.next() + " " + scan.nextInt());

		for(int i = 0; i < c; i++ ) {
			char first = scan.next().charAt(0);
			String last = scan.next();
			int d = scan.nextInt();
			double total = 0;
			for (int j = 0; j < d; j++ ) {
				int quant = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				total += quant * price;

			}
			System.out.println(first + "." + " " + last + ":" + " " + String.format("%.2f", total));
		}

	}
}
// make three different arrays, one for first name, last name and a sum one
// first name should have only first names ex: naeha, nina, as well as last name
//sum needs to be a double and put them all in a for loop to add up the values
// make a variable c that is the first number, the total # of customers