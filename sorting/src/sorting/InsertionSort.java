package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		new InsertionSort() ; 
	}


	public InsertionSort(){
		int[] A = { 9, 6, 5, 7, 4, 3, 2, 1} ;
		System.out.println("Before Sorting ...");
		print(A) ;
		sort( A) ;
		System.out.println("After Sorting ...");
		print(A) ;
	}


	private void print(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%5d", A[i]);
		}		
		System.out.println();
	}


	private void sort(int[] A) {
		int i ; // counter for sorted part of the array.
		int j ; // counter for un-sorted part of the array.

		int key ; // next element to insert into the A[ 1 ... j-1 ]

		// Linear search
		for ( j = 1; j < A.length; j++) {
			i = j - 1 ;
			key = A[ j ] ;
			while( i >= 0 && A[i] > key ){
				A[ i + 1 ] = A[i] ;
				i-- ;
			}
			A[ i + 1 ] = key ; 
		}
		
		// Binary search
		
		int high ;
		int low ;
		
		
		for ( j = 1; j < A.length; j++) {
			key = A[ j ] ;
							
			low = 0 ; 
			high = j - 1 ;
			int mid ;
			while( low < high ){
		
				mid = ( high + low ) /2 ;
				
				
			}
			A[ high + 1 ] = key ; 
		}
		
	}

}
