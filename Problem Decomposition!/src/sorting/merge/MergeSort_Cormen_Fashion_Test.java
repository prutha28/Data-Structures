package sorting.merge;

import java.util.Scanner;

public class MergeSort_Cormen_Fashion_Test {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in ) ;
		System.out.println("\nHow many elements ?");
		int n = input.nextInt() ;

		int data[] = new int[ n ] ;

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter A[ %d ]" , i );
			data[ i ] = input.nextInt() ;
		}

		System.out.println("\nThe contents of the array before sorting are : ");

		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d", data[ i ]);
		}

		// Sort
		
		MergeSort_Cormen_Fashion sorter = new MergeSort_Cormen_Fashion() ;
		
		sorter.MERGESORT( data , 0, n-1 ) ;
		
		System.out.println("\nThe contents of the array after sorting are : ");

		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d", data[ i ]);
		}
	}

}
