package implementing.queues.using.resizable.arrays;

/**
 * @author prutha!
 *
 * QUEUES USING RE-SIZABLE ARRAYS... whenever the array is full, the array is doubled.	
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

	public static final int SIZE = 5 ;

	// NOTE : 
	// This variable just keeps a count of the number of times we are resizing the array.
	// For the count'th time the array size will be = SIZE * ( 2 ^ count )  
	
	private int count = 1 ;
	
	int[] data ;
	private int front ; 
	private int rear ;
	
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
	public void enqueue(int data) {
		
		// First Time enqueue
		if( isEmpty()){
			// First time only, increase both.
			rear++ ;
			front++ ;
		}
		
		if( isFull()){
			
			// 1. Create a new array of double size.

			int[] newData = new int[  (int) (SIZE * Math.pow(2, count)) ] ;
			
			// 2. Copy values form old array into the new array
			int i ;
			for ( i = 0; i < this.data.length; i++) {
				newData[ i ] = this.data[ i ] ;
			}
			// 3. Copy the new value into the array.
			newData[ rear ] = data ;		// i = rear -1  here
			this.data = newData ;
			count++ ;
		}
		else
		{
			this.data[ rear ] = data ;	
		}

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

	// NOTE : 
	// This logic here changes
	// size >= SIZE so that size = 0 is not counted.
	// size >= SIZE, = is for counting the size = 5
	// Thus the array is regarded full , when, for any value equal to or greater than SIZE, 
	// the no of elements is div by SIZE.
	public boolean isFull() {
		int size = size() ;
		
		if( (size >= SIZE) && size % SIZE == 0 )
			return true ;
		else
			return false ;
				// || (rear >= SIZE ) ) ; This wont be a condition
	}


	public void displayQueue() {

		int index = front ;
		
		while( index < rear ){
			System.out.println("   " + data[index]);
			index++ ;
		}
	}
}
