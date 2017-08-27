package interviewquestion.vendingmachine;

import java.math.BigDecimal;

public class Output {
	private final Item item;
	private final BigDecimal change;
	
	public Output(Item item, BigDecimal change){
		
		this.item = item;
		this.change = change;
	}
	public Output(Item item){
		
		this.item=item;
		this.change=null;
	}
	
	public Output(BigDecimal returnedMoney){
		
		this.change = returnedMoney;
		this.item = null;
	}
	
	protected Item getItem() {
		return item;
	}
	protected BigDecimal getChange() {
		return change;
	}
	@Override
	public String toString() {
		return "Output: [item=" + item + ", change=" + change + "]";
	}
	
	
}
