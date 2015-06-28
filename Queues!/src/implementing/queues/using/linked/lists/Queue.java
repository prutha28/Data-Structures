package implementing.queues.using.linked.lists;


/**
 * We will imagine the Queue to consist of nodes.
 * @author prutha!
 *
 *	We will assume the queue is a linked list such that
 *	
 *	HEAD ptr == FRONT
 *	TAIL ptr == REAR
 *
 * 	Insertions happen at the tail of the queue.
 *  Deletions happen from the head of the queue.
 *
 *	Tail always points to the last node in the linked list.
 *
 * 	There is no limit on the size of the queue.
 *
 */

class Node{
	int data ;
	Node next ;

	public Node( int data, Node next){
		this.data = data ;
		this.next = next ;
	}
}

public class Queue implements IQueue {

	// Pointer to the tail of the Queue.
	Node tail ;

	// Pointer to the head of the Queue.
	Node head ;

	// An empty Queue with 0 nodes.
	public Queue()
	{
		head = null ;
		tail = null ;
	}

	// Append at the tail	
	public void enqueue(int data) throws QueueEmptyException {

		Node newNode = new Node( data, null ) ;

		// First insertion
		if( isEmpty()){
			head = newNode ;
			tail = newNode ;
		}else{
			// Appending at tail.. O(1)
			tail.next = newNode ;
			// Advance the tail.
			tail = tail.next ;
		}
	}

	// Remove from the front of the queue.
	public int dequeue() throws QueueEmptyException {

		if( isEmpty()){
			throw new QueueEmptyException() ;
		}

		int popped = head.data ;
		head = head.next ;
		return popped ;
	}

	public int front() throws QueueEmptyException {
		return head.data ;
	}

	public int size() {
		int size = 0 ;

		if( head == null){
			return 0 ;
		}

		Node current = head ;

		while( current != null){
			size++ ;
			current = current.next ;
		}
		return size;
	}

	public boolean isEmpty() {
		if( head == null && tail == null)
			return true ;
		else
			return false;
	}

	public void displayQueue() {

		Node current = head ;

		while( current != null ){
			System.out.println("  " + current.data);
			current = current.next ;
		}
	}

}
