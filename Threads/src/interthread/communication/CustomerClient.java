package interthread.communication;

public class CustomerClient {
	
	public static void main(String[] args) {

		Customer c = new Customer() ;
		WithdrawalThread withdrawalThread = new WithdrawalThread(c) ;
		DepositThread depositThread = new DepositThread(c) ;
	}
}
