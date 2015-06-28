package ordered.linked.lists;

public interface IOrderedLinkedList {

	public void insert( int data ) ;
	
	public void delete( int data ) ;
	
	public boolean contains( int data ) ;
	
	public OrderedLinkedList union( OrderedLinkedList other ) ;
	
	public OrderedLinkedList intersection( OrderedLinkedList other ) ;
	
	public int size() ;
	
}
