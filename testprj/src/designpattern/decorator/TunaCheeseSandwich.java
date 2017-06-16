package designpattern.decorator;

import java.math.BigDecimal;

public class TunaCheeseSandwich extends SandwichDecorator {

	public TunaCheeseSandwich(Sandwich original) {
		super(original);
	}

	@Override
	protected BigDecimal price() {

		if (super.originalSandwich instanceof TunaSandwich)

			return super.originalSandwich.price().add(new BigDecimal("0.50"));

		else if (super.originalSandwich instanceof CheeseSandwich)

			return super.originalSandwich.price().add(new BigDecimal("0.80"));

		else
			return super.originalSandwich.price();
	}

	@Override
	protected String description() {

		if (super.originalSandwich instanceof TunaSandwich)
			return originalSandwich.description() + " and Cheese Topping";

		else if (super.originalSandwich instanceof CheeseSandwich)

			return originalSandwich.description() + " and Tuna Topping";

		else
			return super.originalSandwich.description();
	}

}
