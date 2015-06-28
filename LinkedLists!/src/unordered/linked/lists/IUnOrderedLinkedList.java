package unordered.linked.lists;

public interface IUnOrderedLinkedList {

	public void insert( int data ) ;
	
	public void delete( int data ) ;
	
	public boolean contains( int data ) ;
	
	public UnOrderedLinkedList union( UnOrderedLinkedList other ) ;
	
	public UnOrderedLinkedList intersection( UnOrderedLinkedList other ) ;
	
	public int size() ;
	
}
