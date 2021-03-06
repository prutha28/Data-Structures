package ordered.linked.lists;

public class OrderedLinkedListTest {

	public static void main(String[] args) {
		
		OrderedLinkedList list1 = new OrderedLinkedList() ;
		list1.insert( 4 );
		list1.insert( 7 );
		list1.insert( 3 );
		list1.insert( 6 );
		list1.insert( 9 );
		list1.insert( 1 );
			
		System.out.println("List1 : ");
		list1.displayList( list1.head ) ;

		OrderedLinkedList list2 = new OrderedLinkedList() ;
		
		list2.insert( 6 );
		list2.insert( 4 );
		list2.insert( 2 );
		list2.insert( 0 );
		list2.insert( 8 );
		list2.insert( 9 );
		
		System.out.println("\nList2 : ");
		list2.displayList( list2.head ) ;

		System.out.println();
		System.out.println();
		
		OrderedLinkedList union = list1.union(list2) ;
		System.out.println("\nUnion of List1 & List2 : ");
		union.displayList( union.head ) ;
		
		OrderedLinkedList intersection = list1.intersection(list2) ;
		System.out.println("\nIntersection of List1 & List2 : ");
		intersection.displayList( intersection.head ) ;
	}

}
