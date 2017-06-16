package interviewquestion.vendingmachine;

import java.math.BigDecimal;

public interface VendingMachineOperation {
	
	public Output inputItemCode(long code) throws VendingMachineException;
	
	public Output cancelPurchase() throws VendingMachineException;
	
	public BigDecimal insertMoney(BigDecimal amount);

}
