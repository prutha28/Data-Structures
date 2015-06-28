package bubble.sorting;

public class BubbleSort {

	public void sort(int[] data) {
		
		int len = data.length ; 
		
		for (int i = 0; i <= ( len-2 ) ; i++) {
			for (int j = i + 1 ; j <= ( len - 1) ; j++) {
				if( data[i] > data[j]){
					int temp = data[ i ] ;
					data[ i ] = data[ j ] ;
					data[ j ] = temp ;
				}
			}
		}
	}
	
}
