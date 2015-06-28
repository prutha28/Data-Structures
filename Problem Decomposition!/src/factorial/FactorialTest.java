package factorial;

import java.util.Scanner;

public class FactorialTest {

	public static void main( String[] args){		

		int n ;
		Scanner input = new Scanner(System.in) ;
		System.out.println("\nEnter the number whose factorial you desire");

		n = input.nextInt() ;
		System.out.println("\nThe factorial of " + n + " is " 
				+ Factorial.factorial(n));
	}
}
