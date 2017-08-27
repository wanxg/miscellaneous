package interviewquestion;

import java.util.Map;
import java.util.TreeMap;

public class CountOccurrencesOfCharacter {

	public static void main(String[] args) {

		
		getOccurrences("Java J2EE Java JSP J2EE").entrySet().stream().forEach(entry-> {
			System.out.print(entry.getKey()+"=");
			System.out.println(entry.getValue());
		});
		
	}
	
	public static Map<Character,Integer> getOccurrences(String s){
		
		Map<Character,Integer> occurrences  = new TreeMap<Character,Integer>();
		
		s.chars().forEach(c -> {
			
			if(!occurrences.containsKey((char)c))
				
				occurrences.put((char)c, 1);
			
			else
				occurrences.put((char)c, occurrences.get((char)c)+1);
			
		});
		
		return occurrences;
		
	}

}
