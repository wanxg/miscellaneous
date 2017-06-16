package newtest;

public class MyImplementation implements FirstInterface, SecondInterface{

	@Override
	public void eat() {
		System.out.println("I am eating");
		
	}

	@Override
	public void drink() {
		System.out.println("I am drinking");		
	}

	@Override
	public String getName() {
		return SecondInterface.super.getName();
	}

	public static void main(String[] args){
		
		MyImplementation me = new MyImplementation();
		
		System.out.println(me.getName());
		
	}

}


