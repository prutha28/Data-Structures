package implementation.using.lists;

public class QueueClient {

	public static void main(String[] args) {

		Queue q = new Queue() ;
		System.out.println("\nAdding elements to the queue!");
		q.enQueue(50) ;
		q.enQueue(40) ;
		q.enQueue(80) ;
		q.enQueue(510) ;
		q.enQueue(100) ;
		
		q.print() ;
		
		System.out.println("\nRemoving elements from the queue!");
		q.deQueue();
		q.print() ;
	}

}
