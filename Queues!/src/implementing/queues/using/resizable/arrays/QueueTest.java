package implementing.queues.using.resizable.arrays;

public class QueueTest {

	public static void main(String[] args) {


		Queue q = new Queue() ;
		//		try {
		q.enqueue(10) ;
		q.enqueue(20) ;
		q.enqueue(30) ;
		q.enqueue(40) ;
		q.enqueue(50) ;


//		System.out.println("\nThe size of the underlying array is " + q.data.length);
//		System.out.println("\nThe size of the queue is " + q.size());
		// 5 elements inserted, array should now resize. 

		q.enqueue(60) ;
		q.enqueue(70) ;
		q.enqueue(80) ;
		q.enqueue(90) ;
		q.enqueue(100) ;
		q.enqueue(120) ;	
		q.enqueue(130) ;	

		System.out.println("\nThe size of the underlying array is " + q.data.length);
		System.out.println("\nThe size of the queue is " + q.size());
		
		System.out.println("\nQueue After enqueuing");
		q.displayQueue() ;

		//}catch ( QueueEmptyException e) {
		//e.printStackTrace();
		//		}
	}

}
