package client;

import java.io.ObjectInputStream.GetField;

import simple.enums.BatchStatus;

public class EnumMethodsDemoClient {

	static BatchStatus[] simpleBatchStatus = BatchStatus.values() ;
	static detailed.enums.BatchStatus[] detailedBatchStatus = detailed.enums.BatchStatus.values() ;

	public static void main( String[] args){

		System.out.println("The batch status in simple format are :");

		//ordinals

		for (BatchStatus batchStatus : simpleBatchStatus) {
			System.out.println(batchStatus + "  " + "ordinal value : " + batchStatus.ordinal());
		}

		System.out.println();
		System.out.println();
		System.out.println("The batch status in detailed format are :");

		for (detailed.enums.BatchStatus batchStatus : detailedBatchStatus) {
			System.out.println(batchStatus + "  " + "ordinal value : " 
					+ batchStatus.ordinal() +"  " + "value :"
					+ batchStatus.getBatchStatus());
		}

		System.out.println();
		System.out.println();
		// compare to
		// compares the ordinal values of the 2 enum constants within the same enumeration.

		if(BatchStatus.OPEN.compareTo(BatchStatus.CLOSE) < 0){
			System.out.println("OPEN comes before CLOSE");
		}else if(BatchStatus.OPEN.compareTo(BatchStatus.CLOSE) > 0){
			System.out.println("OPEN comes after CLOSE");
		}else{
			System.out.println("Same Enum Constant");
		}

		//equals .. can compare for equality any 2 objects.
		//but returns true only when the same constant in the same enumeration is compared.
		//even if 2 constants with the same values ( BUT different enum class)
		// are compared using equals, it will return false as shown. 
		
		BatchStatus simpleBatchStatus = BatchStatus.OPEN ;
		detailed.enums.BatchStatus detailedBatchStatus = detailed.enums.BatchStatus.OPEN ;

		System.out.println();
		System.out.println();

		if(simpleBatchStatus.equals(detailedBatchStatus)){
			System.out.println("Both are equal!");
		}
		else{
			System.out.println("Both are unequal!");
		}

		System.out.println(BatchStatus.CLOSE.getDeclaringClass());
		System.out.println(BatchStatus.CLOSE.getClass());
		
	}

}
