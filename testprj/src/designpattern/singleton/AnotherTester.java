package designpattern.singleton;

public class AnotherTester {

	public static void main(String[] args) {
		
		
		//MySingleton singleton = MySingleton.getInstance();
		
		
		MySingleton singleton = new MySingleton();
		
		System.out.println(singleton.getValue());

	}

}
