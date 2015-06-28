package interthread.communication;

public class WithdrawalThread implements Runnable {

	Customer c ; 
	
	public WithdrawalThread( Customer c) {
		this.c = c ;
		new Thread(this, "Withdrawal").start();
	}

	@Override
	public void run() {
		c.withdraw(15000) ;
	}

}
