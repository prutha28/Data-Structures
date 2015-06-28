package unordered.linked.lists;

class Node{
	int data ;
	Node next ;

	public Node( int data){
		this.data = data ;
		this.next = null ;
	}
}

public class UnOrderedLinkedList implements IUnOrderedLinkedList {

	Node head ;
	Node tail ;

	public UnOrderedLinkedList(){
		this.head = null ;
		this.tail = null ;
	}

	public UnOrderedLinkedList( UnOrderedLinkedList other){
		this.head = other.head ;
		this.tail = other.tail ;
	}

	// Insert at the beginning.
	public void insert(int data) {

		Node newNode = new Node(data) ;

		if( head == null){
			head = newNode ;
			tail = head ;
		}else{
			newNode.next = head ;
			head = newNode ;
		}
	}

	// First search, then delete.
	public void delete(int data) {

		Node nodeToDel = null ;
		Node current = head ;
		Node prev = current ;

		if( head == null){
			System.out.println("\nData wasnt found");
			return ;
		}else if( head != null && head.next == null ){
			head = null; 
			return ;
		}

		while( current != null && current.data != data){

			prev = current ;
			current = current.next ;
		}

		if( current == null){
			System.out.println("\nData wasnt found");
			return ;
		}else{
			nodeToDel = current ;
			prev.next = current.next ;
			current = null ;
			return ;
		}
	}

	public boolean contains(int data) {
		boolean isFound = false ;

		Node current = head ;

		while( current !=null )
		{
			if( current.data == data){
				isFound = true ;
				break ;
			}
			else
				current =  current.next ;
		}

		return isFound ;
	}

	public UnOrderedLinkedList union( UnOrderedLinkedList otherList) {

		UnOrderedLinkedList union = new UnOrderedLinkedList( this) ;

		if( this.head == null && otherList.head == null )
			return null ;

		else if( this.head == null && otherList.head != null)
			return otherList ;

		else if( this.head != null && otherList.head == null)
			return this ;

		Node otherHead = otherList.head ;

		// While Scanning through the other list, add an element of the other list
		// to the union only if, it is not already in the union.
		while( otherHead !=null ){
			if(!union.contains(otherHead.data))
			{
				union.insert(otherHead.data) ;
			}
			// Advance pointer without doing anything.
			otherHead = otherHead.next ;
		}

		return union ;
	}


	public UnOrderedLinkedList intersection( UnOrderedLinkedList otherList) {
		UnOrderedLinkedList intersection = new UnOrderedLinkedList() ;
		Node head1 = this.head ;
	
		while( head1 !=null ){
			if( otherList.contains(head1.data)){
				intersection.insert(head1.data) ;
			}
			head1 = head1.next ;
		}

		return intersection ;
	}

	public int size() {

		return 0;
	}

	public void displayList( Node head ) {
		
		Node current = head ;

		while( current !=null )
		{
			System.out.printf("%4d", current.data );
			current = current.next ;
		}

	}

}
