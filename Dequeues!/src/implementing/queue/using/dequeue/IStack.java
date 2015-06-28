package implementing.queue.using.dequeue;

public interface IStack {

	public void push( int data ) ;
	
	public int pop() throws StackEmptyException;
	
	public int top() throws StackEmptyException;
	
	public int size() ;
	
	public boolean isEmpty() ;
	
}
