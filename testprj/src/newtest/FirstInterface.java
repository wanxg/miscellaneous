package newtest;

public interface FirstInterface {
	int id = 1;
	String name = "I am the first interface";
	
	default String getName(){
		return name;
	};
	
	void eat();
}
