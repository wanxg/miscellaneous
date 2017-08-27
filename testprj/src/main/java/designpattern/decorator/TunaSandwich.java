package designpattern.decorator;

import java.math.BigDecimal;

public class TunaSandwich extends SandwichDecorator {

	public TunaSandwich(Sandwich original) {
		super(original);
	}

	@Override
	protected BigDecimal price() {
		return super.originalSandwich.price().add(new BigDecimal("0.80"));
	}

	@Override
	protected String description() {
		return originalSandwich.description() + " with Tuna Topping";
	}

}
