package detailed.enums;

public enum BatchStatus {

	CLOSE("C"), REOPEN("R") , OPEN("O") ;
	
	String batchStatus ;
	
	public String getBatchStatus() {
		return batchStatus;
	}

	BatchStatus(String batchStatus) {
		this.batchStatus = batchStatus ;
	}
}
