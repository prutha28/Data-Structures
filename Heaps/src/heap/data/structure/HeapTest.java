package heap.data.structure;

public class HeapTest {

	public static void main(String[] args) {

		int[] arr = { 4, 8, 1, 14, 81, 9, 10, 18 } ;
	
		Heap heap = new Heap(arr) ;
		
		System.out.println("\nInitial Heap :");
		heap.displayHeap() ;
		
		heap.buildMaxHeap() ;
		
		System.out.println("\nAfter Heapifying :");
		heap.displayHeap() ;
		
		System.out.println("\nAfter Heap Sort :");
		heap.sort() ;
		heap.displayHeap() ;
	}

}
