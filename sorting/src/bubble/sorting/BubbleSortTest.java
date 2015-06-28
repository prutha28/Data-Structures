package bubble.sorting;

public class BubbleSortTest {

	public static void main( String[] args ){

		int data[] = { 5, 18, 9, 3, 7, 1, 51 } ; 

		System.out.println("\nElements before sorting");

		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d", data[ i ]);
		}

		new BubbleSort().sort(data) ;

		System.out.println("\nElements after sorting");
		
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d", data[ i ]);
		}
	}

}
