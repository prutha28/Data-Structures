package producer.consumer;

public class PCClient {

	public static void main(String[] args) {
		Queue q = new Queue() ;
		Producer p = new Producer(q) ;
		Consumer c = new Consumer(q) ;
	}

}
