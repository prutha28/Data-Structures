package implementing.dequeues.using.doubly.linked.lists;

public interface IDequeue {

	public Node insertFirst( int data) ;

	public Node insertLast( int data) ;

	public Integer removeFirst() ;

	public Integer removeLast() ;

	public Integer first() ;

	public Integer last() ;
}
