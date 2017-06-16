package interviewquestion.vendingmachine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interviewquestion.vendingmachine.VendingMachineException.ErrorType;

public class SnackVendingMachine extends VendingMachine {

	
	private List<Item> items = new ArrayList<Item>();

	public SnackVendingMachine() {
		
		super();

		items = Arrays.asList(

				new Item("Chocolate", new BigDecimal("2.50"), 100),

				new Item("Cola", new BigDecimal("3.50"), 101),

				new Item("Cookie", new BigDecimal("3.00"), 102),

				new Item("Gummybear", new BigDecimal("2.00"), 103),

				new Item("Chips", new BigDecimal("3.50"), 104)

		);

		System.out.println("Vending Machine Items : ");
		System.out.println();

		for (Item item : items)
			System.out.println("\t" + item.getCode() + " - " + item.getName() + " - " + "$" + item.getPrice());
		System.out.println();
		
		System.out.println("Balance: " + this.showInsertedMoney());
		
		System.out.println();

	}


	private Item findItem(long code) {

		for (Item it : items) {
			if (it.getCode() == code) {
				return it;
			}
		}

		return null;
	}

	@Override
	public Output inputItemCode(long code) throws VendingMachineException {
		
		System.out.println("Inputting Item Code: " + code);
		System.out.println();
		
		Item item = findItem(code);
		
		if (item == null)
			throw new VendingMachineException(ErrorType.ITEM_CODE_UNKNOWN, "Please input another code.");
		
		if(this.balance.compareTo(item.getPrice()) == -1 ){
		
			System.out.print(item);
			System.out.print(", ");
			System.out.println("Balance: " + this.balance);
			throw new VendingMachineException(ErrorType.MONEY_NOT_ENOUGH, "Please insert more money.");
		
		}
		
		Output output = new Output(item,this.balance.subtract(item.getPrice()));
		this.balance = new BigDecimal("0.00");
		
		return output;
	}

}
