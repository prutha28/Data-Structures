package implementing.queues.using.fixed.size.arrays;

public class QueueTest {

	public static void main(String[] args) {


		Queue q = new Queue() ;
		try {
			q.enqueue(10) ;
			q.enqueue(20) ;
			q.enqueue(30) ;
			q.enqueue(40) ;
			q.enqueue(50) ;
			q.enqueue(60) ;
			q.enqueue(70) ;
			q.enqueue(80) ;
			q.enqueue(90) ;
			q.enqueue(100) ;	

			System.out.println("\nQueue After enqueuing");
			q.displayQueue() ;

			System.out.println("\nDequeue " + q.front() + " & and then enqueue 110");
			q.dequeue() ;
			q.displayQueue() ;

			//	Even if you try to enqueue a new element, although the queue is not full, 
			//	it won't allow any more addition of elements.

			//	System.out.println("\nQueue After enqueuing the 11th element");
			//	q.enqueue(110) ;


		}catch (QueueFullException | QueueEmptyException e) {
			e.printStackTrace();
		}
	}

}
