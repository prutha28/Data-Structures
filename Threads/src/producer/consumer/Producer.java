package producer.consumer;

public class Producer implements Runnable{

	/**
	 *  A producer produces some data & returns it.
	 */
	Queue q ; 

	Producer( Queue q ){
		this.q = q ;
		new Thread(this, "Producer Thread").start() ;
	}

	@Override
	public void run() {
		int data = 1 ;
		while( true){
			q.putDataOnQueue(data++) ;
		}
	}

}
