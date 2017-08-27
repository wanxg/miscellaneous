package designpattern.decorator;

import java.math.BigDecimal;

public class WhiteBreadSandwich extends Sandwich {

	@Override
	public BigDecimal price() {
		return new BigDecimal("3.00");
	}

	@Override
	protected String description() {
		return "White Bread Sandwich";
	}



}
