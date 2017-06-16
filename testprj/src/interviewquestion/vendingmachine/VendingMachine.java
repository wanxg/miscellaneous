package interviewquestion.vendingmachine;

import java.math.BigDecimal;

public abstract class VendingMachine implements VendingMachineOperation{

	protected BigDecimal balance;
	
	public VendingMachine(){
		
		balance = new BigDecimal("0.00");
	}
	
	@Override
	public Output cancelPurchase() {
		
		System.out.println("Cancelling Purchase ...");
		System.out.println();
		
		Output output = new Output(this.balance);
		
		this.balance = new BigDecimal("0.00");
		
		System.out.println("Balance: " + this.showInsertedMoney());
		System.out.println();
		
		return output;
	}
	
	@Override
	public BigDecimal insertMoney(BigDecimal amount){
		
		System.out.println("Inserting Money: " + amount);
		System.out.println();
		
		this.balance = this.balance.add(amount);
		
		System.out.println("Balance: " + this.showInsertedMoney());
		System.out.println();
		
		return this.balance;
	}
	
	public BigDecimal showInsertedMoney(){
		
		return this.balance;
	}
}
