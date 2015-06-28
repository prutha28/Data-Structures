package producer.consumer;

public class Queue {

	int data ;
	boolean isProduced = false ;

	synchronized public void putDataOnQueue( int data){

		while( isProduced == false ){			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
			this.data = data ;
			isProduced = true ;
			System.out.println("put " + data);
			notify() ;
	}

	synchronized public int getDataOnQueue(){

		while( isProduced == true ){			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("Got " +data);
		isProduced = false ;
		notify() ;
		return data ;
	}

}
