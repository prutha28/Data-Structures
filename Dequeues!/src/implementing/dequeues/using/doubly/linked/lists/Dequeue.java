package implementing.dequeues.using.doubly.linked.lists;

/**
 * A Dequeue supports insertion & deletion at both ends.
 * Thus, to support deletion at the tail end of the linked list, 
 * we will implement a dequeue using a doubly linked list.
 * 
 * Why DLL ?!
 * 
 * To support deletion at the end, we need a pointer to the node 
 * just before the node to be deleted. ( i.e. just before the tail ptr)
 * 
 * In a SLL, we can only traverse in the forward direction, 
 * so there is no way to get back to the previous node.
 * 
 * A DLL, on the other hand, by definition provides a link to its previous node. 
 * 
 * Using a DLL, All the operations can be done in O(1) time.
 *   
 * @author prutha!
 *
 */

class Node{
	int data ;
	Node next ;
	Node prev ;

	public Node( int data, Node next, Node prev){
		this.data = data ;
		this.next = next ;
		this.prev = prev ;
	}
}

public class Dequeue implements IDequeue {

	private Node head ;
	private Node tail ;

	public Dequeue(){
		head = null ;
		tail = null ;
	}
	
	// Enqueuing Operations.
	public Node insertFirst(int data) {

		if( head == null){
			// First Insertion
			head = new Node( data , null , head ) ;
			tail = head ;
		}else{
			Node newNode = new Node(data, null, null ) ;
			newNode.prev = head.prev ;
			newNode.next = head ;
			head = newNode ;
			newNode.next.prev = newNode ;
		}

		return head ;	
	}

	public Node insertLast(int data) {

		if( tail == null){
			// Empty Queue, so same as insertion at head.
			head = new Node(data, null, head) ;
			tail = head ;
		}else{
			Node newNode = new Node(data, null, null) ;
			tail.next = newNode ;
			newNode.prev = tail ;
			tail = newNode ; 
		}
		return head ;
	}


	// Dequeuing operations

	/**
	 *  This fn removes the first element from the dequeue.
	 *  If the dequeue is empty it simply returns null.
	 */
	public Integer removeFirst() {

		int popped ;

		if( isEmpty())
			return null ; // return -1 ;
		else{
			popped = head.data ;
			head.next.prev = head ;
			head = head.next ;
		}

		return popped ;
	}


	/**
	 *  This fn removes the last element from the dequeue.
	 *  If the dequeue is empty it simply returns null.
	 */
	public Integer removeLast() {
		int popped ;

		if( isEmpty())
			return null ; // return -1 ;
		else{
			popped = tail.data ;
			tail.prev.next = null ;
			tail = tail.prev ;
		}

		return popped ;
	}
	/**
	 *  This method returns the element at the front of the dequeue.
	 *  Returns null if the dequeue is empty.
	 *  We could as well have kept -1 as a sentinel value,
	 *  used to indicate that the queue is empty.
	 */
	public Integer first() {
		if( isEmpty())
			return null ; // return -1 ;
		return head.data ;
	}

	/**
	 * This method returns the element at the end of the dequeue.
	 * Returns null if the dequeue is empty.
	 * We could as well have kept -1 as a sentinel value,
	 * used to indicate that the queue is empty.
	 */
	public Integer last() {
		if( isEmpty())
			return null ; // return -1 ;
		else
			return tail.data ;
	}


	/**
	 * This method checks the head & tail pointers, and if both are null
	 * returns that the dequeue is empty.
	 * @return
	 */
	public boolean isEmpty(){

		if( head == null && tail == null )
			return true ;
		else 
			return false ;
	}

	public void displayQueue(){

		Node current = head ;

		if( current == null ){
			System.out.println("\nQueue is empty.");
		}

		while( current != null ){
			System.out.printf("%4d", current.data );
			current = current.next ;
		}

	}


	// Alternately, we could have functions that throw an exception
	// if the queue is empty. ( instead of returning null. )

	// POLL = dequeue  ...  pollFirst & pollLast
	// PEEK = front    ...  peekFirst & peekLast

	/**
	 *  This fn removes the first element from the dequeue.
	 *  If the dequeue is empty, it throws QueueEmptyException.
	 */
	public Integer pollFirst() throws QueueEmptyException{

		int popped ;

		if( isEmpty())
			throw new QueueEmptyException() ;
		else{
			popped = head.data ;
			head.next.prev = head ;
			head = head.next ;
		}

		return popped ;
	}


	/**
	 *  This fn removes the last element from the dequeue.
	 *  If the dequeue is empty, it throws QueueEmptyException.
	 */
	public Integer pollLast() throws QueueEmptyException{
		int popped ;

		if( isEmpty())
			throw new QueueEmptyException() ;
		else{
			popped = tail.data ;
			tail.prev.next = null ;
			tail = tail.prev ;
		}

		return popped ;
	}
	/**
	 *  This method returns the element at the front of the dequeue.
	 *  If the dequeue is empty, it throws QueueEmptyException.
	 */
	public Integer peekFirst() throws QueueEmptyException {
		if( isEmpty())
			throw new QueueEmptyException() ;
		return head.data ;
	}

	/**
	 * This method returns the element at the end of the dequeue.
	 *  If the dequeue is empty, it throws QueueEmptyException.
	 */
	public Integer peekLast() throws QueueEmptyException {
		if( isEmpty())
			throw new QueueEmptyException() ;
		else
			return tail.data ;
	}

	public int size() {
		int count = 0;
		
		Node current = head ;
		
		if( current == null){
			return 0 ;
		}
		
		while( current != null){
			count++ ;
			current = current.next ;
		}
		return count ;
	}
}
