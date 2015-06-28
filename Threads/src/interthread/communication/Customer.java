package interthread.communication;

class Customer {

	int amount = 10000 ;
	
	synchronized public void withdraw ( int amount ){
		
		System.out.println("Amount currently held by customer is : " + this.amount);
		System.out.println("Amount to withdraw is " + amount);
		if( amount > this.amount){
			System.out.println("Wait for deposit");
			try {
				wait() ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount =  this.amount -  amount ;
		System.out.println("Withdrawal successful!");
	}
	
	
	synchronized public void deposit( int amount){
		this.amount = this.amount + amount ;
		System.out.println(amount + " Deposited Successfully!" );
		System.out.println("Notifying the thread");
		notify() ;
	}
}
