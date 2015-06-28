package geek.linked.lists;

public class MiddleOfLL {
	
/**
	Method 2:
	Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
	When the fast pointer reaches end slow pointer will reach middle of the linked list.
	O( n)
 **/

	public static int getMid( Node head){

		// Empty list.
		if( head == null ){
			return -1 ;
		}
		// Only 1 element.
		if( head.next == null ){
			return head.data ;
		}
		
		Node slow = head ;
		Node fast = head.next ;

		while( fast != null){
			fast = fast.next ;
			if( fast != null){
				fast = fast.next ;
				slow = slow.next ;
			}
		}

		return slow.data ;
	}
	
	
//	Method 1:
//	Traverse the whole linked list and count the no. of nodes.
//	Now traverse the list again till count/2 and return the node at count/2.
}
