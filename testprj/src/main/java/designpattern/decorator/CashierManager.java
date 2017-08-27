package designpattern.decorator;

import java.math.BigDecimal;
import java.util.List;

public class CashierManager {
	
	public static BigDecimal calculatePrice(List<Sandwich> sandwichs){
		
		BigDecimal totalPrice = new BigDecimal("0.00");
		
		for(Sandwich sandwich : sandwichs)
			totalPrice= totalPrice.add(sandwich.price());
		
		return totalPrice;
		
	}
}
