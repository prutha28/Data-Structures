package geek.linked.lists;

public class Node {

	int data ;
	Node next ;

	public Node(){
		this( -1, null) ;
	}

	public Node( int data, Node next){
		this.data = data ;
		this.next = next ;
	}
}
