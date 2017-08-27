package learn.lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import learn.lambda.Person.Sex;

public class LambdaTester {

	
	public void doSomething(Person p){
		if(p.gender.equals(Sex.FEMALE))
			System.out.println(p);
	}
	
	
	public static void main(String[] args) {
		
		LambdaTester test = new LambdaTester();
		
		List<Person> people = Arrays.asList(
				new Person("Xiaolong", LocalDate.of(1978, 6, 22),Sex.MALE,"wanxiaolong@gmail.com"),
				
				new Person("Xiaoxia", LocalDate.of(1980, 11, 9),Sex.FEMALE,"eon.wang@gmail.com"),
				
				new Person("Emily", LocalDate.of(2011, 3, 30),Sex.FEMALE,"emily.yifan.wan@gmail.com"),
				
				new Person("Luna", LocalDate.of(2016, 9, 30), Sex.FEMALE, "luna.zhilin.wan@gmail.com")
				);
		
		//people.forEach(System.out::println);
		
		people.forEach(test::doSomething);
		
		
	}

}
