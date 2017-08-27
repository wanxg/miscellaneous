package interviewquestion.vendingmachine;

import java.math.BigDecimal;

public class Client {

	public static void main(String[] args) {
		
		VendingMachine vendingMachine = new SnackVendingMachine();
		
		vendingMachine.insertMoney(new BigDecimal("2.00"));
		
		vendingMachine.insertMoney(new BigDecimal("1.00"));
		
		Output output = vendingMachine.cancelPurchase();
		
		System.out.println(output);
		System.out.println();
		
		
		vendingMachine.insertMoney(new BigDecimal("5.00"));
		
		try {
			output = vendingMachine.inputItemCode(104);
		} catch (VendingMachineException e) {
			System.out.print(e.getErrorType());
			System.out.print(", ");
			System.out.println(e.getMessage());
		}
		
		System.out.println(output);
		System.out.println();
		
		vendingMachine.insertMoney(new BigDecimal("3.00"));
		try {
			output = vendingMachine.inputItemCode(101);
		} catch (VendingMachineException e) {
			System.out.print(e.getErrorType());
			System.out.print(", ");
			System.out.println(e.getMessage());
			output=null;
		}
		System.out.println(output);
		System.out.println();
		
		
	}

}
