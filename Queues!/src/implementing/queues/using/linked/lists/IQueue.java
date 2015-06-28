package implementing.queues.using.linked.lists;

public interface IQueue {

	public void enqueue( int data ) throws QueueEmptyException ;
	
	public int dequeue() throws QueueEmptyException ;

	public int front() throws QueueEmptyException ;
	
	public int size() ;
	
	public boolean isEmpty() ;
}
