package testprj;

public class NewTester {

	public static void main(String[] args) {

		Book b = new Book(){
			
			public String getName(){
				
				return "Not a " + super.getName();
				
			}
			
		};
		
		b.setName("Effective Java");
		
		System.out.println(b);
		System.out.println(b.getName()	);

	}

}
