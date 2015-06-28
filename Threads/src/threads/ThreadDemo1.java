package threads;


class MyThread extends Thread{

	@Override
	public void run() {

		for ( int i = 0; i < 10 ; i++){
			System.out.println("Hello " + i );
			try {
				Thread.sleep(10000) ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}




public class ThreadDemo1 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread() ;
		t1.start() ;
		t1.start() ;
	}

}
