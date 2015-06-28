package threads;


class Runner implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run :" + Thread.currentThread());
	}

}

public class ThreadMethods {

	public static void main(String[] args) {

		Runner runner = new Runner() ;
		Thread t1 = new Thread(runner, "One") ;
		Thread t2 = new Thread(runner, "Two") ;
		Thread t3 = new Thread(runner, "Three") ;

		t1.start() ;
		try {
			System.out.println("Pausing the execution of t1 thread");
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start() ;
		t3.start();

	}

}
