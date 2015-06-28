package implementation.using.arrays;

public class Queue {

	// variables
	private int[] elementArray = new int[10] ;
	/**
	 * Initially both these are -1 when the queue is empty.
	 * As the queue grows in size, start points to the head of the queue 
	 * & end points to the tail of the queue.
	 */
	private int start = -1 ;
	private int end = -1 ;
	
	/**
	 * The method adds the specified element to the head of the queue.
	 * @param element
	 */
	public void enQueue( int element) {
		start = 0  ;
		end++ ;
		elementArray[start]  = element ;
	}
	
	/** 
	 * This method removes/ dequeues the element present at the end / tail of the queue.
	 * returns null if queue is empty.
	 * @return element at the tail
	 */
	public Integer deQueue() {
		Integer element = null ;
		
		return element ;
	}
	
}
