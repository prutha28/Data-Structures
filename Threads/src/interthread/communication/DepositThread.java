package interthread.communication;

public class DepositThread implements Runnable{

	Customer c = new Customer() ;
	
	public DepositThread(Customer c) {
		this.c = c ;
		new Thread(this, "Deposit").start();
	}
	
	@Override
	public void run() {
		c.deposit(20000) ;
	}

}
