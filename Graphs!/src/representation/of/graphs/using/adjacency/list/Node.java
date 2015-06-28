package representation.of.graphs.using.adjacency.list;

public class Node {

	int weight ; // or vertex no.
	Node next ; // pointer to the next vertex.
	
	public Node( int weight){
		this.weight = weight ;
		this.next = null ;
	}
}
