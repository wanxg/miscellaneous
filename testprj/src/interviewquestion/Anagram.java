package interviewquestion;

import java.util.Arrays;

public class Anagram {

	private static final String ASTRING = "Mother In Law";
	private static final String BSTRING = "Hitler Woman";

	public static void main(String[] args) {
		
		
		ASTRING.chars()
		
		.mapToObj(i -> (char) i)
		
		.map(i -> {
			return Character.toLowerCase(i);
		})
		
		.sorted()
		
		.filter(i->{
			
			if(i.equals(' '))return false;
			
			return true;
		})
		
		.forEach(item -> {
			System.out.print(Character.toString(item));

		});

		System.out.println();
		
		
		BSTRING.chars()
		
		.mapToObj(i -> (char) i)
		
		.map(i -> {
			return Character.toLowerCase(i);
		})
		
		.sorted()
		
		.filter(i->{
			
			if(i.equals(' '))return false;
			
			return true;
		})
		
		.forEach(item -> {
			System.out.print(Character.toString(item));

		});
		
		System.out.println();
		System.out.println("------------------------------------------");
		
		char[] a = ASTRING.toCharArray();
		
		System.out.println(a);
		
		Arrays.sort(a);
		
		System.out.println(a);

	}

}
