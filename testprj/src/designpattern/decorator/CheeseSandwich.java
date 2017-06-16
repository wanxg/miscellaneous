package designpattern.decorator;

import java.math.BigDecimal;

public class CheeseSandwich extends SandwichDecorator{


	public CheeseSandwich(Sandwich original) {
		super(original);
	}

	@Override
	public BigDecimal price() {

		return super.originalSandwich.price().add(new BigDecimal("0.50"));
		
	}

	@Override
	protected String description() {
		return originalSandwich.description() + " with Cheese Topping";
	}

}
