package newtest;

public interface ThirdInterface extends FirstInterface, SecondInterface {

	int id = 3;
	String name = "I am the third interface";
	
	@Override
	default String getName() {
		return name;
	}
	
	void run();

}
