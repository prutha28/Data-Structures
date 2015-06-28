package producer.consumer;

public class Queue_other {

	private int data = 10 ; 
	boolean isDataConsumed = false ;

	/*
	 *  If Data has been consumed, producer can produce more i.e.
	 *  isDataConsumed == false, producer waits.  
	 */
	/**
	 *  produces the data and puts it onto the queue.
	 * @return
	 */
	synchronized public int putDataOnQueue( int data ) {
		while( isDataConsumed){
			try {
				System.out.println("Data hasnt been consumed yet, so producer waits " +
						"for consumer to consume.");
				wait() ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// After the consumer consumes data, producer now produces.
			// while the producer produces, consumer will have to wait.
			this.data = data ;  
			isDataConsumed = false ; // since the latest data produced hasn't been consumed
			System.out.println("put" + data);
			// After the producer produces, consumer will have to resume.
			notify() ; // notifying the consumer to consume this newly produced data.
		}
		return data ; 
	}

	synchronized public int consumeDataFromQueue() {
		// Consumer waits when producer is producing
		// ( producer will only produce when previous data was consumed) 
		// i.e. isDataConsumed is true

		while( isDataConsumed){
			try {
				// wait till producer is done producing new data
				wait() ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// After the producer produces, consumer will resume
			// it will now consume the newly produced data

			// After it consumes, isDataConsumed is true
			System.out.println("Consumed" + data);
			notify() ;
			isDataConsumed = true ; 

		}
		return data ;
	}
}
