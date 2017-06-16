package interviewquestion.vendingmachine;

public class VendingMachineException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	enum ErrorType {
		
		ITEM_CODE_UNKNOWN,
		MONEY_NOT_ENOUGH,
		INTERNAL_ERROR
		
	}
	
	private ErrorType errorType; 
	
	
	public VendingMachineException(ErrorType errorType,String errorMessage){
		super(errorMessage);
		this.errorType=errorType;
	}


	protected ErrorType getErrorType() {
		return errorType;
	}
	
	

}
