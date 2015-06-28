package hashing.basics;

public class HashTest {

	public static void main(String[] args) {

		Hash itemsHash = new Hash() ;

		//		itemsHash.printHashTable() ;

		Item item = new Item("111", "Marie Gold",20, null ) ;
		itemsHash.addItem(item) ;

		item = new Item("222", "Hide & Seek", 50, null ) ;
		itemsHash.addItem(item) ;

		item = new Item("333", "Britania", 60, null ) ;
		itemsHash.addItem(item) ;

		item = new Item("444", "Maggie", 10, null ) ;
		itemsHash.addItem(item) ;

		//		itemsHash.printHashTable() ;
		//		Printing the elements in a particular bucket slot.
		//		itemsHash.printItemsInIndex(6) ;
		//		itemsHash.printItemsInIndex(5) ;


		// Searching the item.
//		if( itemsHash.containsItem(item)){
//			System.out.println("\n" + item.getProductName() + " is found!");
//		}else{
//			System.out.println("\n" + item.getProductName() + " is not found!");
//		}
//
		Item item1 = new Item("444", "Apple juice", 10, null ) ;
//		if( itemsHash.containsItem(item1)){
//			System.out.println("\n" + item1.getProductName() + " is found!");
//		}else{
//			System.out.println("\n" + item1.getProductName() + " is not found!");
//		}

		itemsHash.addItem(item1) ;
		System.out.println("\nItems Before Deletion");
		itemsHash.printHashTable() ;

		// Deleting Items.
		// Case 1 The bucket slot contains exactly 1 item & thats matching... No more subsequent elements to deal with.
		itemsHash.deleteItem(item1) ;	
		System.out.println("\nAfter Deleting " + item1.getProductName());
		itemsHash.printHashTable() ;

		System.out.println("---------------------------------------------------------------------------------------------");

		// Case 2
		// Match is located in the first item , BUT there are more items in the bucket.
		Item item2 = new Item("111", "Marie Gold",20, null ) ;
		itemsHash.deleteItem(item2) ;	
		System.out.println("\nAfter Deleting " + item2.getProductName());
		itemsHash.printHashTable() ;

		System.out.println("---------------------------------------------------------------------------------------------");
		// Case 3 : The bucket contains the item somewhere in between, not the first one.	
		// Deleting Items.
		Item item3 = new Item("444", "Maggie", 10, null ) ;
		itemsHash.deleteItem(item3) ; 
		System.out.println("\nAfter Deleting " + item3.getProductName());
		itemsHash.printHashTable() ;

		
		// Deleting an item that is not present.
		Item item4 = new Item("333", "Parle", 50, null ) ;
		System.out.println("\nAfter Deleting " + item4.getProductName());
		itemsHash.deleteItem(item4) ; 
	}

}
