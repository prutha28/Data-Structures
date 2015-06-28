package client;

import detailed.enums.BatchStatus;

public class DetailedEnumClient {

	String status  = BatchStatus.OPEN.getBatchStatus() ;
	
	static BatchStatus[] batchStatusValues = BatchStatus.values() ;
	
	public static void main( String[] args){
		for (BatchStatus status : batchStatusValues) {
			System.out.println(status + " = " +  status.getBatchStatus());
		}
	}
	
}
