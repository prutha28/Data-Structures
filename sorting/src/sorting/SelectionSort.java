package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		new SelectionSort() ;
	}

	public SelectionSort(){		
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


	private void sort( int[] A ) {
		int minIndex  ;
		for (int counter = 0; counter < A.length; counter++) {
			 minIndex = findMinIndex( A, counter, A.length ) ;
			 int temp = A[counter] ;
			 A[counter] = A[minIndex] ;
			 A[minIndex] = temp ;
//			 swap( A[ minIndex ], A[ counter ]) ; 
		}
	}
	
	private void swap(Integer num1, Integer num2) {
		Integer temp = num1 ;
		num1 = num2 ;
		num2 = temp ;
	}

	private int findMinIndex( int[] arr, int beginIndex, int endIndex ){
		int min = arr[beginIndex] ;
		int minIndex = beginIndex ; 
		for (int i = beginIndex; i < endIndex ; i++) {
			if( arr[ i ] < min ){
				min = arr[ i ] ;
				minIndex = i ;
			}
		}
		return minIndex;		
	}
}
