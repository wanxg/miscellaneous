package newtest;

public interface SecondInterface {
	
	int id = 2;
	String name = "I am the second interface";
	
	default String getName(){
		return name; 
	}
	
	void drink();

}
