package implementing.queues.using.circular.arrays;

/**
 * @author prutha!
 *
 * QUEUES USING CIRCULAR ARRAYS OF A GIVEN SIZE.	
 * 
 * front, rear = -1
 * ------------------------------------------
 * |	|	| 	|	|	|	|	|	|	|	|
 * ------------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 * 
 * front = 0	     rear = 4  
 * ------------------------------------------
 * |  2	| 5	| 6	| 8 |	|	|	|	|	|	|		size = rear - front = 4 - 0 = 4
 * ------------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *
 * 			 front = 2	     rear = 6  
 * ------------------------------------------
 * |	| 	| 6	| 8 | 7 | 9	|	|	|	|	|
 * ------------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *
 * 			 front = 2	     			 rear = 9
 * ------------------------------------------
 * |	| 	| 6	| 8 | 7 | 9	| 1 | 2 | 4 | 	|
 * ------------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *
 * 	rear = 0  front = 2	     			 			size = rear - front = 0 -2 = -2  ||		-2 + 10 = 8
 * 	-----------------------------------------
 * 	|	| 	| 6	| 8 | 7 | 9	| 1 | 2 | 4 | 3	|
 * 	-----------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *	Initially front, rear both will be -1.
 *	We add elements to the rear of the queue.
 *	and remove from front.
 *
 *	Front is the index of element to be removed next.
 *	Rear is the index at which you will insert the element.
 *	
 *	Thus, if u want to increment rear beyond n-1, 	rear = ( 9 + 1 ) % 10
 *													rear = (rear + 1) % SIZE
 *
 *	When rear & front are equal, the queue may either be full or it may be empty.
 *	To distinguish between the two, we will make the queue hold ATMOST n-1 elements
 *	so that whenever rear+1 = front, we say queue is full & 
 *	when front == rear then queue is empty.  
 *
 *	
 * 	rear = 1  front = 2 --- FULL	     			 		rear + 1 == front		(rear+1) % SIZE == front
 * 	-----------------------------------------
 * 	| 8	| 	| 6	| 8 | 7 | 9	| 1 | 2 | 4 | 3	|
 * 	-----------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *
 *	
 * 	front = 0							 rear = 9 --- FULL  rear + 1 == SIZE ..		(rear+1) % SIZE == front		 
 * 	-----------------------------------------
 * 	| 8	| 7	| 6	| 5 | 4 | 9	| 1 | 2 | 5 | 	|
 * 	-----------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *
 *
 * 				front = 3				 rear = 9 ---NOT FULL  rear + 1 == SIZE ..		 
 * 	-----------------------------------------
 * 	| 	| 	| 	| 5 | 4 | 9	| 1 | 2 | 5 | 	|
 * 	-----------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 */


public class Queue implements IQueue {

	public static final int SIZE = 10 ;
	int[] data ;
	int front ; 
	int rear ;

	public Queue()
	{
		front = -1 ;
		rear = -1 ;
		data = new int[ SIZE ] ;
		
		for( int i = 0 ; i < SIZE; i++)
		{
			data[ i ] = -1 ;
		}
	}


	// We will enqueue at the rear.
	public void enqueue(int data) throws QueueFullException {
		if( isFull()){
			throw new QueueFullException() ;
		}

		// First Time Enqueue.
		if( isEmpty()){
			front = ( front + 1 ) % SIZE ;
			rear = ( rear + 1 ) % SIZE ;
		}
		this.data[ rear ] = data ;
		rear = ( rear + 1 ) % SIZE ;
	}

	public int dequeue() throws QueueEmptyException {
		if( isEmpty())
			throw new QueueEmptyException() ;

		int popped = data[ front] ;
		data[ front] = -1 ; // sentinel
		front = ( front + 1 ) % SIZE ;
		return popped ;
	}

	public int front() throws QueueEmptyException {
		if( isEmpty())
			throw new QueueEmptyException() ;

		return data[front] ; 
	}

	
	// return ( r -f + SIZE) % SIZE
	public int size() {
		
		if( rear > front )
			return (rear - front) ;
		else
			return ( rear - front + SIZE ) ;	// NOTE this !!!
	}

	public boolean isEmpty() {
		if( front ==  rear )
			return true ;
		else
			return false;
	}

	public boolean isFull() {
//		if((( rear + 1) == front) || (( rear + 1) == SIZE ))
//			return true ;
//		else
//			return false ;
		
		if( size() == ( SIZE -1)){
			return true ;
		}else{
			return false ;
		}
	}


	public void displayQueue() {

		System.out.println("\nThe contents of the array from front to rear are : ");
		
		int index = front ;
		
		while ( index < SIZE && this.data[ index] != -1){		// -1 is the sentinel value. data[ SIZE] will always hold -1
			System.out.println("   " + this.data[ index]);
			index = (index +1) % SIZE ;
		}
	}
}
