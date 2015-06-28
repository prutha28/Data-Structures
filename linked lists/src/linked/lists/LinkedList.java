package linked.lists;

public class LinkedList {

	private Node startNode ;

	private int size ;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node createNode(Object value){
		Node newNode = new Node( value, null) ;
		return newNode ;
	}

	public Node createLinkedList( int size ){
		startNode = createNode( 10) ;
		Node temp = startNode ;

		for ( int i = 1; i < size ; i++){
			temp.nextNode = createNode(10 *i) ;
		}
		return startNode;
	}



}
