package sorting.quick;

public class QuickSort {

	/**
	 * Sorts the array contained within the indices p & r ( both inclusive).
	 * @param data
	 * @param p
	 * @param r
	 */

	// RECURSIVE
	public void QUICKSORT( Integer data[], int p, int r ){

		System.out.println("\nEntered with indices p = " + p + " and r = " + r);
		// BASE case
		if( p >= r)
			return ;

		// INDUCTIVE
		else{	// p < r
			int partitionIndex = PARTITION( data , p, r) ;			// DECOMPOSE or Splitting of array.
			QUICKSORT(data, p, partitionIndex - 1 ) ;
			QUICKSORT(data, partitionIndex , r ) ;
		}
	}

	// Written based on IIT D tut.
	private int PARTITION(Integer[] data, int p, int r) {

		// Lets consider the first element of the array as our pivot.
			int pivot = data[ p ] ;	 
//		int pivot = 4 ;

		// counters
		int i = p ;
		int j = r ;

		// All the elements of data array that are less than/equal to the pivot 
		// are kept to the left & all those that are greater than pivot to the right.

		while( i < j ){

			while( ( i < j) && data[ i ] <= pivot ){
				i++ ;
			}

			while( ( i < j) && data[ j ] > pivot ){
				j-- ;
			}

			// i.e. If any of the above for loops are exited because the second condition fails
			// and first condition still holds.

			// if(( data[ i ] > pivot )||( data[ j ] < pivot ) ) equivalent to the single condition below.
			if( i < j ){
//				exchange( data[i] , data[j] ) ;
				int temp = data[i] ;
				data[i] = data[j] ;
				data[j] = temp ;
			}
		}// This loop exits when i crosses j .. so i is the beginning of the new subarray.

		return i ;
	}

	private void exchange( Integer x, Integer y) {
		Integer temp = x ;
		x = y ;
		y = temp ;
	}

	// Written based on IIT KGP tut.
	private int partition( int A[]){

		int start = 0 ; 
		int end = A.length -1 ;
		int pivot = A[start] ;

		// We will keep 2 counters .. one at the index 2 i.e right after the pivot.
		// and the second at the last index.

		// As long as the element being parsed is less than pivot, retain it in its position 
		// and advance the pointer.

		// Similarly for the end pointer.

		while( start < end ){

			while(( start < end ) && ( A[start] <= pivot ))
				start++ ;

			while(( start < end ) && ( A[end] > pivot ))
				end-- ;
			if( start < end ){
				// Else swap the two
				int temp = A[start] ;
				A[start] = A[end] ;
				A[end] = temp ;
			}
		}

		return start ;
	}


}
