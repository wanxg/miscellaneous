package lean.lambda;

import java.time.LocalDate;

public class Person {
	
	public enum Sex {
        MALE, FEMALE
    }
	String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    
    public Person(String name, LocalDate birthday, Sex gender, String email){
    	this.name=name;
    	this.birthday=birthday;
    	this.gender = gender;
    	this.emailAddress = email;
    }
    
    public String toString(){
    	
    	return "Name: "+this.name+", Birthday:"+this.birthday+", Gender:"+this.gender+", Email:"+this.emailAddress;
    }
}
