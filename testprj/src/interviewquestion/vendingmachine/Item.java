package interviewquestion.vendingmachine;

import java.math.BigDecimal;

public class Item {
	
	private String name;
	
	private BigDecimal price;
	
	private long code;
	
	public Item(String name, BigDecimal price, long code) {
		super();
		this.name = name;
		this.price = price;
		this.code = code;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected BigDecimal getPrice() {
		return price;
	}

	protected void setPrice(BigDecimal price) {
		this.price = price;
	}

	protected long getCode() {
		return code;
	}

	protected void setCode(long code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + ", code=" + code + "]";
	}
	
	

}
