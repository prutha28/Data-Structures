package implementing.queues.using.fixed.size.arrays;

/**
 * @author prutha!
 *
 * QUEUES USING FIXED SIZE ARRAYS.	
 * 
 * front, rear = -1
 * ------------------------------------------
 * |	|	| 	|	|	|	|	|	|	|	|
 * ------------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 * 
 * front = 0	     rear = 4  
 * ------------------------------------------
 * |  2	| 5	| 6	| 8 |	|	|	|	|	|	|
 * ------------------------------------------
 *   0    1   2   3   4   5   6   7   8   9
 *
 *	Initially front, rear both will be -1.
 *	We add elements to the rear of the queue.
 *	and remove from front.
 *
 *	Front is the index of element to be removed next.
 *	Rear is the index at which you will insert the element.
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
		
		// First Time enqueue
		if( isEmpty()){
			// First time only, increase both.
			rear++ ;
			front++ ;
		}
		this.data[ rear ] = data ;
		rear++ ;
	}

	public int dequeue() throws QueueEmptyException {
		if( isEmpty())
			throw new QueueEmptyException() ;
		
		int popped = data[ front] ;
		data[ front] = -1 ; // sentinel
		front++ ;
		return popped ;
	}

	public int front() throws QueueEmptyException {
		if( isEmpty())
			throw new QueueEmptyException() ;
		
		return data[front] ; 
	}

	public int size() {
		return (rear - front) ;
	}

	public boolean isEmpty() {
		if( front == rear )
			return true ;
		else
			return false;
	}

	public boolean isFull() {
		return( (SIZE == size()) || (rear >= SIZE ) ) ;
	}


	public void displayQueue() {

		int index = front ;
		
		while( index < rear ){
			System.out.println("   " + data[index]);
			index++ ;
		}
	}
}
