package sorting.quick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sorting.merge.MergeSort;

public class QuickSortTest_usingLists {

	public static void main(String[] args) {

		Integer L[] = { 8, 9, 1, 4, 3, 5, 7, 6 } ;
		List<Integer> list = Arrays.asList(L) ;
		
		List<Integer> sortedList = QuickSort_usingLists.SORT( list ) ;
		
		for (Integer element : sortedList) {
			System.out.printf("%4d", element );
		}

	}

}
