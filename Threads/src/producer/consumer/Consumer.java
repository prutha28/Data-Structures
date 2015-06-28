package producer.consumer;

public class Consumer implements Runnable {
	/**
	 *  A consumer consumes the data produced. i.e. sets the data
	 */
	Queue q ;

	Consumer(Queue q){
		this.q = q ;
		new Thread( this, "Consumer Thread").start() ;
	}

	@Override
	public void run() {
		int data ;
		while( true){
			data = 
					q.getDataOnQueue() ;
		}
	}
}
