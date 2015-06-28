package sorting.insertion;

public class InsertionSort {

	public static void main(String[] args) {

		new InsertionSort();
	}


	public InsertionSort(){

		// Sorting Strings
		//		String[] names = { "Z", "Viraj", "Sparsh", "Prutha", "Anar" } ;
		//		System.out.println("Names before sorting ");
		//		print( names ) ;
		//		sort( names  ) ;
		//		System.out.println("Names after sorting ");
		//print( names ) ;

		// Sorting Integers
		Integer[] numbers = { 9, 8, 7, 6, 4, 3, 2, 1 } ;
		System.out.println("Numbers before sorting ");
		print( numbers ) ;
		i_sort_using_binary_search( numbers ) ;
		System.out.println("Numbers after sorting ");
		print( numbers ) ;
	}


	private void sort(String[] names) {
		int i, j;
		String key ;
		for ( j = 1; j < names.length; j++) {
			i = j - 1 ;
			key = names[ j ] ;
			while( i >= 0  && (key.compareTo(names[i]) < 0 )){
				names[ i + 1 ] = names[ i ] ;
				i-- ;
			}
			names[ i + 1 ] = key ;
		}
	}

	/**
	 * This method sorts the numbers array using the insertion sort.
	 * @param numbers
	 */
	private void sort(Integer[] numbers) {
		int i, j;
		int key ;
		for ( j = 1; j < numbers.length; j++) {
			i = j - 1 ;
			key = numbers[ j ] ;
			while( i >= 0  && key < numbers[i]){
				numbers[ i + 1 ] = numbers[ i ] ;
				i-- ;
			}
			numbers[ i + 1 ] = key ;
		}
	}



	private void i_sort_using_binary_search(Integer[] numbers) {
		int i, j;
		int key ;

		for ( j = 1; j < numbers.length; j++) {
			i = j - 1 ;
			key = numbers[ j ] ;
			// Location for insertion.
			int loc = binary_search(numbers, key, 0, i) ;

			// Shift all elements from starting loc 

			while ( i > 0 && loc >=  i){
				numbers[ i + 1 ] = numbers[ i ] ;
				i-- ;
			}
			numbers[ i + 1 ] = key ;
		}
	}

	private int binary_search( Integer[] numbers, int item, int low, int high ){

		int mid = ( high + low ) /2 ;

		if (high <= low)
			return (item > numbers[low])?  (low + 1): low;

			if( item == numbers[ mid ])
				return (mid +1) ;
			if( item > numbers[ mid ] ) 
				return binary_search(numbers, item, mid + 1, high) ;
			return binary_search(numbers, item, low, mid) ;
	}


















	private void print(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
