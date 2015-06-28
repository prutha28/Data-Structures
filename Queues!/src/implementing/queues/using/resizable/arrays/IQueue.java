package implementing.queues.using.resizable.arrays;

public interface IQueue {

	public void enqueue( int data )  ;
	
	public int dequeue() throws QueueEmptyException ;

	public int front() throws QueueEmptyException ;
	
	public int size() ;
	
	public boolean isEmpty() ;
	
	public boolean isFull() ;
}
