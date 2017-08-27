package interviewquestion.vendingmachine;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class VendingMachineTest {
	
	@Test
	public void testVendingMachineCreation(){
		
		VendingMachine machine = new SnackVendingMachine();
		
		assertEquals("inserted 1.00", new BigDecimal("1.00"), machine.insertMoney(new BigDecimal("1.00") ));
		
		assertEquals("balance should be 3.50", new BigDecimal("3.50"), machine.insertMoney(new BigDecimal("2.50") ));
		
		Output output = machine.cancelPurchase();
		
		assertEquals("balance should be 0.00", new BigDecimal("0.00"), machine.showInsertedMoney() );
		
		assertEquals("output should be 3.50", new BigDecimal("3.50"), output.getChange() );
	}
	
	
	@Test
	public void testVendingMachineInputItemCode(){
		
		
		VendingMachine machine = new SnackVendingMachine();
		
		machine.insertMoney(new BigDecimal("3.50"));
		
		try {
			System.out.println(machine.inputItemCode(104));
		} catch (VendingMachineException e) {
			System.out.print(e.getErrorType());
			System.out.print(", ");
			System.out.println(e.getMessage());
		}
		
		
	}

}
