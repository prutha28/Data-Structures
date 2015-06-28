package heap.data.structure;

public interface IHeap {

	public int[] buildMaxHeap() ;
	
	public void maxHeapify( int A[], int index ) ;
	
	public int getMaxElement() ;
	
	public void removeMaxElement() ;
	
	public int parentIndex( int nodeIndex ) ;
	
	public int leftChildIndex( int nodeIndex ) ;
	
	public int rightChildIndex( int nodeIndex ) ;
	
	public int parent( int nodeIndex ) ;
	
	public Integer left( int nodeIndex ) ;
	
	public Integer right( int nodeIndex ) ;
}
