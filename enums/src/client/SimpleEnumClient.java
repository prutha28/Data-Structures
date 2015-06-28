package client;

import simple.enums.BatchStatus;

public class SimpleEnumClient {

	public static void main(String[] args) {
		
		BatchStatus[] status = BatchStatus.values() ;
		
		for (BatchStatus batchStatus : status) {
			System.out.println(batchStatus);
		}
	}

}
