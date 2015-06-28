package recursion;

public class BinarySearch {

	public static void main(String[] args) {

		new BinarySearch() ;
	}

	public BinarySearch(){
		int[] arr = { 9, 13, 23, 45, 56, 77, 79, 79, 90} ; 
		int index ; 
		index = binarySearch( arr, 79, 0 , 8) ;
		System.out.println("Using Recursive Binary searc Index = " + index );
		
		index = binarySearch_itr(arr, 79, 0, 8) ;
		System.out.println("Using Iterative Binary searc Index = " + index );
	}


	private int binarySearch(int[] arr, int element, int low, int high ) {

		// Base condition 1
		if( low > high ) return -1 ;
		
		// Base condition 2		
		if(( low == high ) && ( element == arr[low] ) ) return low ; 
		
		int mid = ( high + low ) /2 ;

		// Base condition 3
		if (  element == arr[mid] ) 
			return mid ;

		else if ( element < arr[ mid ] ) 
			return binarySearch(arr, element, low, mid )	;

		else if ( element > arr[ mid ] ) 
			return binarySearch(arr, element, mid + 1 , high )	;

		else
			return -1 ;
	}
	
	
	private int binarySearch_itr(int[] arr, int element, int low, int high ) {
		
		int mid ;
		
		while( low <= high)
		{
			mid = low + ( high - low ) /2 ;
			
			if( element == arr[ mid ])
				return mid ;
			else if( element < arr[ mid ]){
				high = mid ;
			}
			else{
				low = mid + 1 ;
			}
		}
		return -1 ;
	}

}
