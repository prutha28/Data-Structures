package sorting;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MergeSort() ;
	}

	public MergeSort(){
		int[] A = { 9, 6, 5, 7, 4, 3, 2, 1} ;
		System.out.println("Before Sorting ...");
		print(A) ;
		mergeSort( A, 0 , 7) ;
		System.out.println("After Sorting ...");
		print(A) ;
	}


	private void mergeSort(int[] A, int p, int r) {

		int q ; 
		// 1. Base Case
		if ( r - p <= 0) return ; // If no of elements is zero, the array is already sorted!  

		// 2. Recursive call with smaller problem.
		if( r - p > 0){
			q = (r - p ) / 2 ;
			mergeSort( A, p, q ) ;
			mergeSort( A, q + 1, r ) ;
			merge( A, p , q, r ) ;
		}
	}


	private void merge(int[] A, int p, int q, int r) {

		// Number of elements in L
		int n1 = q - p + 1 ;

		// Number of elements in R
		int n2 = r - q ;

		// Arrays for left and right halves.

		int[] L = new int[n1] ;
		int[] R = new int[n2] ;


		int i = 0 ; // Counter over L
		int j = 0 ; // Counter over R
		int k = 0 ; // Counter over A

		// Copy values of A[p ... q] into L
		
		for ( i = 0 ; i < n1 ; i++) {
			L[ i ] = A[ p + i ] ;
		}
		// Copy values of A[q+1 ... r] into R
		
		for ( j = 0 ; j < n2 ; j++) {
			R[ j ] = A[ q + j + 1 ] ;
		}
		
		// Reset i & j
		i = 0 ; 
		j = 0 ;
		
		while ( i < n1 && j < n2)
		{
			if ( L[ i ] <= R[ j ] ){
				A[ k ]  = L[ i ] ;
				i++ ;
			}else{
				A[ k ]  = R[ j ] ;
				j++ ;
			}

			k++ ;
		}

		while ( i < n1 )
		{
			A[ k ]  = L[ i ] ;
			i++ ;
			k++ ;
		}

		while ( j < n2 )
		{
			A[ k ]  = R[ j ] ;
			i++ ;
			k++ ;
		}

	}

	private void print(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%5d", A[i]);
		}		
		System.out.println();
	}


}
