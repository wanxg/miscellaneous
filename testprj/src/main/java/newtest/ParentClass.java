package newtest;


public class ParentClass {
	
	protected ParentClass get(int i) throws ClassNotFoundException {
		
		if(i>1)
			
			throw new ClassNotFoundException();
		
		return this;
	}

}
