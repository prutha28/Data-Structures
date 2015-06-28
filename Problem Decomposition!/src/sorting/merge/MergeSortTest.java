package sorting.merge;

public class MergeSortTest {

	public static void main(String[] args) 
	{

		int[] L = { 8, 9, 1, 4, 3, 5, 7, 6 } ;

//		int[] sortedList = sort( L ) ;
		
		int[] sortedList = MergeSort.SORT(L) ;
		
		for (int a = 0; a < sortedList.length; a++) {
			System.out.println(sortedList[ a ]);	
		}

	}

	private static int[] sort(int[] L ) 
	{
		int n = L.length ; // 8

		// BASE 

		if( n == 1)
			return L ;

		// INDUCTIVE

		// Step 1: Split L into 2 non-empty sets L1 and L2.

		int[] L1 = new int[ n/2 ] ;//.. 0 to (len-1)/2 i.e. (len + 1) /2 # elements
		int[] L2 = new int[ n/2 ] ;

		int i ;
		for ( i = 0; i < n/2 ; i++) {
			L1[ i ] = L[ i ] ;
		}

		for (int j = 0 ; (j < n) && ( i < n); j++) {
			L2[ j ] = L[ i ] ;
			i++ ;
		}

		//		for (int a = 0; a < L1.length; a++) {
		//			System.out.println(L1[ a ]);	
		//		}
		//		System.out.println("__________________");
		//		for (int a = 0; a < L2.length; a++) {
		//			System.out.println(L2[ a ]);	
		//		}

		// Step 2: Sort L1 & L2 Recursively.

		int[] sortedL1 = sort( L1 ) ;
		int[] sortedL2 = sort( L2 ) ;

		// Step 3: 

		int[] sortedL = merge( sortedL1, sortedL2) ;

		return sortedL;

	}

	private static int[] merge(int[] L1, int[] L2) 
	{
		int len = L1.length + L2.length ;
		int[] sortedList = new int[ len ] ;

		int k = 0 ; // iterates on sortedList

		int i = 0 , j = 0 ; // iterators on L1 & L2 
		while( i < L1.length && j < L2.length ){
			if( L1[i] < L2[j]){
				sortedList[k] = L1[i] ;
				i++ ;
			}else{
				sortedList[k] = L2[j] ;
				j++ ;
			}
			k++ ;
		}


		while( i < L1.length ){
			sortedList[k] = L1[i] ;
			i++ ;
			k++ ;
		}

		while( j < L2.length ){
			sortedList[k] = L2[j] ;
			j++ ;
			k++ ;
		}


		return sortedList;
	}

}
