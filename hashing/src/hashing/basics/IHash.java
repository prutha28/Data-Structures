package hashing.basics;

public interface IHash {

	public void addItem( Item item ) ;

	public Item searchItem( String key ) ;

	public void deleteItem( Item item ) ;
	
	public int numberOfItemsInBucket( int index ) ;
	
	public void printHashTable() ;
	
	public void printItemsInIndex( int index ) ;

	public boolean containsKey( String key ) ;
	
}
