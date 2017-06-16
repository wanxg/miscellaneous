package designpattern.decorator;

import java.math.BigDecimal;

public abstract class Sandwich {
	
	protected abstract BigDecimal price();

	protected abstract String description();
	
}
