package linked.lists;

public class LinkedListDemo {

	public static void main(String[] args) {

		Node node1, node2, node3, node4 ;

		node1 = new Node() ;
		node2 = new Node() ;
		node3 = new Node() ;
		node4 = new Node() ;

		node1.value = 3 ;
		node2.value = 4 ; 
		node3.value = 5 ;
		node4.value = 6 ;


		node1.nextNode = node2 ;
		node2.nextNode = node3 ;
		node3.nextNode = node4 ;
		node4.nextNode = null ;

		Node temp = node1 ;
		while( temp!=null){
			System.out.print("  Value = " + temp.value );
			temp = temp.nextNode ;
		}
		
		
	}
}
