package hashing.basics;

/**
 * In a hash table, all the 3 operations - search, delete & insert can 
 * be performed in constant time.
 * 
 * Each operation involves computing of the hash code based on the key being input.
 * @author prutha!
 *
 *
 *	Consists of 2 fields : 
 *
 * 	 1. Size of the Hash Table = # slots.
 * 		public static final int TABLE_SIZE = 10 ;
 *  
 * 	 2. The HashTable array of pointers to Item 
 *     of size ( as defined above)
 *
 *	Each element in the hashTable array is a pointer to the start of a LL of Items.
 *  Each Item has a nextItem field pointing to the next item in the LL.
 *  
 *  private Item hashTable[] ;
 * 
 */


public class Hash implements IHash {

	// # slots
	public static final int TABLE_SIZE = 10 ;

	// # data array 
	private Item hashTable[] ; 

	// Constructor
	public Hash()
	{
		hashTable = new Item[ TABLE_SIZE ] ;

		// Sets each array element to default values.

		//		for (int i = 0; i < hashTable.length; i++) {
		//			hashTable[ i ].setProductId("") ;
		//			hashTable[ i ].setProductName("") ;
		//			hashTable[ i ].setProductPrice(0) ;
		//			hashTable[ i ].setNextItem(null);
		//		}
	}

	public void addItem( Item item )
	{
		int index = item.hashCode() ;

		Item currentItem = hashTable[index] ;

		if( currentItem == null )
		{
			// First Insertion.
			hashTable[index] = item ;
		}
		else
		{
			// Subsequent Insertions.

			// Traverse till the last node.
			while( currentItem.getNextItem() != null )
			{
				currentItem = currentItem.getNextItem() ;
			}
			currentItem.setNextItem( item );
		}
	}


	/**
	 *  Searches the hash table for the entry with the given key
	 *  and returns the Item corresponding to that key.
	 */
	public Item searchItem( String key ){
		Item item = new Item(key) ;
		int index = item.hashCode() ;
		// Go to that index of the hash table

		if( hashTable[ index ] == null){
			return null ;
		}else{
			Item current = hashTable[ index ] ;

			while( current != null ){
				if(key.equals(current.getProductName())){
					// Item found in the linked list at the particular index.
					return current ;
				}
				else{
					current = current.getNextItem() ;
				}
			}
			// Item not found even after traversing the entire linked list at the particular index.
			return null ;
		}
	}


	public void deleteItem( Item item ){
		int index = item.hashCode() ;
		String key = item.getKey(item) ;

		// Delete the Item having the key.	
		Item itemToRemove = searchItem(key);

		if( itemToRemove !=null){

			// All the cases when the Bucket is guaranteed to have the entry corresponding to the key.

			Item current = hashTable[index] ;
			Item prev = current ;

			// Case 0 : The bucket slot we need to see is empty.
			// This case will never arise.
			if( hashTable[index] == null){
				System.out.println("\nThe slot is empty!");
				return ;
			}

			// the very first element matches.
			else if( current!=null && current.equals(itemToRemove)){
				// Case 1 : The bucket slot contains exactly 1 item & thats matching... No more subsequent elements to deal with.
				if( current.getNextItem() == null){
					hashTable[index] = null ;
					return ;
				}else{
					// Case 2: Match is located in the first item , BUT there are more items in the bucket.
					//( So we will need to adjust the subsequent pointers.)
					hashTable[index] = current.getNextItem() ;
					return ;
				}
			}


			// Case 3 : The bucket contains the item somewhere in between, not the first one.

			while( current !=null && !current.equals(itemToRemove)){
				prev = current ;
				current = current.getNextItem() ;
			}

			prev.setNextItem(current.getNextItem()) ;
			current = current.getNextItem() ;
			return ;

		}else{
			// Item not found in the hashtable, hence cant delete it.
			System.out.println("\nItem to remove is Not found in the table.");
			return ;
		}
	}


	public int numberOfItemsInBucket(int index) {

		int count = 0 ;

		Item current = hashTable[ index ] ;

		if( current == null )
			return count ;

		else
		{
			while( current.getNextItem() != null )
			{
				count++ ;
				current = current.getNextItem() ;
			}
		}
		return count ;
	}

	/**
	 * Prints the very first item in each of the slots of the bucket 
	 * ( i.e. the first item in each index of the bucket )
	 * and also tells us how many items are there in each slot. 
	 */
	public void printHashTable(){

		int number  ; // no of elements in each bucket.

		for (int i = 0; i < TABLE_SIZE ; i++) { // Iterates over the entire bucket.

			number = 0 ; // Make it 0 every item you jump to a new slot( i ) in the bucket.

			Item current = hashTable[ i ] ;

			if( current == null ){
				System.out.println("\nSlot#" + i + " is empty." );
				continue ;
			}
			// Iterates over each element in a particular slot of the bucket.
			while( current != null )
			{
				System.out.println("\nItem #"+ number + " in slot #" + i + " is " + current);
				number++ ;
				current = current.getNextItem() ;
			}

			System.out.println("\nThe number of items in bucket slot " + i + " is " + number );
			System.out.println("\n____________________________________________________________________");
		}

	}


	public void printItemsInIndex( int index ) {

		Item current = hashTable[ index] ;

		if( current == null ){
			System.out.println("\nThere is nothing in this slot #" + index + "  of the bucket.");
			return ;
		}

		System.out.println("\nThe items in slot #" + index + " are as follows :");
		while( current != null )
		{
			System.out.println("________________________________");
			System.out.println( current);
			current = current.getNextItem() ;
		}
		System.out.println("________________________________");	
	}


	public boolean containsKey(String key) {
		Item item = new Item(key) ;
		int index = item.hashCode() ;

		Item current = hashTable[index] ;

		if( current == null )
			return false;

		while( current != null){
			if( current.getProductName().equals(key))
			{
				return true ;
			}else
			{
				current = current.getNextItem() ;	
			}
		}
		return false ;
	}


	public boolean containsItem(Item item) {

		// Step 1. First find the hash code. 
		int index = item.hashCode() ;
		Item current = hashTable[index] ;

		if( current == null )
			return false;

		while( current != null){
			// Step 2. Use equals for comparing item for equality.			
			if( current.equals(item))
			{
				return true ;
			}else
			{
				current = current.getNextItem() ;	
			}
		}
		return false ;
	}

}
