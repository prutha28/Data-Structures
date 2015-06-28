package implementing.dequeues.using.doubly.linked.lists;

public class DequeueTest {

	public static void main(String[] args) {

		Dequeue dq = new Dequeue() ;

		// Check for the empty case first.

		dq.displayQueue() ;

		// Should all return null.
		System.out.println("\nThe first element of the dequeue is : " +  dq.first() );
		System.out.println("\nThe last element of the dequeue is : " +  dq.last() );

		System.out.println("\nThe element removed from the front of the dequeue is : " +  dq.removeFirst());
		System.out.println("\nThe element removed from the end of the dequeue is : " +  dq.removeLast());

		// These will throw the QueueEmptyException.	
		try {
			System.out.println("\nThe first element of the dequeue is : " +  dq.peekFirst() );
			System.out.println("\nThe last element of the dequeue is : " +  dq.peekLast() );
			System.out.println("\nThe element removed from the front of the dequeue is : " +  dq.pollFirst());
			System.out.println("\nThe element removed from the end of the dequeue is : " +  dq.pollLast());
		} catch (QueueEmptyException e) {
			System.out.println("\nEmpty Queue Exception thrown while peek & poll");
		}
		
		
		
		dq.insertFirst( 1 ) ;
		dq.insertFirst( 2 ) ;
		dq.insertFirst( 3 ) ;
		dq.insertLast( 4 ) ;
		dq.insertFirst( 5 ) ;
		dq.insertLast( 6 ) ;
		dq.insertFirst( 7 ) ;
		
		// 7 5 3 2 1 4 6
		dq.displayQueue() ;
		
		
		System.out.println("\nThe first element of the dequeue is : " +  dq.first() );
		System.out.println("\nThe last element of the dequeue is : " +  dq.last() );

		System.out.println("\nThe element removed from the front of the dequeue is : " +  dq.removeFirst());
		dq.displayQueue() ;
		
		System.out.println("\nThe element removed from the end of the dequeue is : " +  dq.removeLast());
		dq.displayQueue() ;
	}

}
