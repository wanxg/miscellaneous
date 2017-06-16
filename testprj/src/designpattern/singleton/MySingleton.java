package designpattern.singleton;

import java.io.Serializable;

public class MySingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static int value;
	
	static{
		
		System.out.println("I am inside a static block of MySingleton!");
		System.out.println("value : " + value);
		
	}
	
	
	public MySingleton(){
		
		System.out.println("Before creating instance");
		
		System.out.println("value : " + value);
		
		value = 100;
		
	};
	
	private static class SingletonHolder {
		
		static{
			
			System.out.println("I am inside a static block of SingletonHolder!");
		}
		
		private static final MySingleton instance = new MySingleton();
		
	}
	
	public static MySingleton getInstance(){
		
		return SingletonHolder.instance;
		
		//return new MySingleton();
		
	}
	
	public int getValue(){
		
		return value;
	}
	
	public void increaseValue(){
		
		value=value+1;
	}

}
