package designpattern.decorator;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		
		Sandwich s1 = new WhiteBreadSandwich();
		
		Sandwich s2 = new CheeseSandwich(new WhiteBreadSandwich());
		
		Sandwich s3 = new TunaSandwich(new WhiteBreadSandwich());
		
		Sandwich s4 = new TunaCheeseSandwich(new CheeseSandwich(new WhiteBreadSandwich()));
		
		Sandwich s5 = new TunaCheeseSandwich(new TunaSandwich(new WhiteBreadSandwich()));
		
		List<Sandwich> sandwichs = Arrays.asList(s1,s2,s3,s4,s5);
		
		for(Sandwich sandwich : sandwichs)
		
			System.out.println(sandwich.description() + ": $" + sandwich.price());
		
		
		System.out.println("Total price: $" + CashierManager.calculatePrice(sandwichs));

	}

}
