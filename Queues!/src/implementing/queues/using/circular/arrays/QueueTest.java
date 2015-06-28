package implementing.queues.using.circular.arrays;

public class QueueTest {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {

		Queue q = new Queue() ;
		q.enqueue(10) ;
		q.enqueue(20) ;
		q.enqueue(30) ;
		q.enqueue(40) ;
		q.enqueue(50) ; 

		q.enqueue(60) ;
		q.enqueue(70) ;
		q.enqueue(80) ;
		q.enqueue(90) ;

		// The queue can at max hold only ( SIZE -1 ) = 9 elements in this case.
		// if you enqueue this one, it will throw an exception.
		//		q.enqueue(100) ;
		//		q.enqueue(120) ;	
		//		q.enqueue(130) ;	
		
		System.out.println("\nQueue After enqueuing");
		q.displayQueue() ;
		
		System.out.println("\nNow dequeue the first 2 elements");
		System.out.println("\nDequeuing " + q.front());
		q.dequeue() ;
		System.out.println("\nand " + q.front());
		q.dequeue() ;

		q.displayQueue() ;
		
		System.out.println("\nNow Enqueue a few elements .. 44 & 55 ");
		
		q.enqueue(44) ;
		q.enqueue(55) ;
		q.displayQueue() ;
	}

}
