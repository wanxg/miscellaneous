package designpattern.singleton;

public enum EnumSingleton {
	
	INSTANCE;

	private EnumSingleton(){
		System.out.println("Constructor");
	}
	
	private int value;

	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args){
		
		System.out.println(EnumSingleton.INSTANCE.getValue());
	}
}
