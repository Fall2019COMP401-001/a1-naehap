package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		
		
		for(int i = 0; i < c; i++) {
			String[] product = new String[c];
			product[i] = scan.next();
			scan.nextInt();
		}
		
	}
}
