package implementing.queues.using.linked.lists;

public class QueueTest {

	public static void main(String[] args) {

		
		Queue q = new Queue() ;
		try {
			q.enqueue(10) ;
			q.enqueue(20) ;
			q.enqueue(30) ;
			q.enqueue(40) ;
			q.enqueue(60) ;
			q.enqueue(50) ;
			
			System.out.println("\nQueue After enqueuing");
			
			q.displayQueue() ;
			
			System.out.println("\nQueue After dequeuing 1 element");
			q.dequeue() ;
			q.displayQueue() ;
			
			System.out.println("\nThe element at the front is " + q.front());
			System.out.println("\nThe size of the queue is " + q.size());
			
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
	}

}
