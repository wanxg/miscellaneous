package newtest;

import java.io.IOException;

public class ChildClass extends ParentClass {
	
	protected ChildClass get(){
		
		return this;
	}
	
	protected ChildClass get(int i){
		
		return this;
		
	}
	
	
	public void doSomething() throws IOException, ClassNotFoundException{
		
		super.get(10);
		
		System.out.println(FirstInterface.id + FirstInterface.name);
	}
	
	public static void main(String[] args){
		
		ChildClass cc = new ChildClass();
		
		try {
			cc.doSomething();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
