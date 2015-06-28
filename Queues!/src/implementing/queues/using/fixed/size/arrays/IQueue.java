package implementing.queues.using.fixed.size.arrays;

public interface IQueue {

	public void enqueue( int data ) throws QueueFullException ;
	
	public int dequeue() throws QueueEmptyException ;

	public int front() throws QueueEmptyException ;
	
	public int size() ;
	
	public boolean isEmpty() ;
	
	public boolean isFull() ;
}
