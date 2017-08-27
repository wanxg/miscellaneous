package interviewquestion;

public class ReverseAString {

	private static final StringBuffer ASTRING = new StringBuffer("Java Concept Of The Day");
	
	public static void main(String[] args) {
		
		switchTwoCharacters(ASTRING, 0, ASTRING.length()-1);
		
		System.out.println(ASTRING);

	}
	
	private static void switchTwoCharacters (StringBuffer aString, int i, int j){
	
		if(i<j){
			char a = aString.charAt(i);
			char b = aString.charAt(j);
			aString.setCharAt(i, b);
			aString.setCharAt(j, a);
			switchTwoCharacters(aString, ++i, --j);
		}
	}

}
