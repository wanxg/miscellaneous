package designpattern.decorator;

public abstract class SandwichDecorator extends Sandwich{
	
	protected Sandwich originalSandwich;
	
	public SandwichDecorator(Sandwich original) {

		this.originalSandwich=original;
	}

}
