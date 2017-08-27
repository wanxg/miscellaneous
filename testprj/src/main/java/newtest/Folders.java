package newtest;

import java.util.ArrayList;
import java.util.Collection;

public class Folders {
	
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	  
    	Collection<String> result = new ArrayList<String>();
    	
    	String[] stringArray = xml.split("folder");
    	
    	for(int i = 0; i<stringArray.length;i++){
    		
    		if(!stringArray[i].contains("name"))
    			continue;
    		
    		else {
    			
    			String temp = stringArray[i].substring(stringArray[i].indexOf("\"")+1, stringArray[i].lastIndexOf("\""));
    			if(temp.startsWith(String.valueOf(startingLetter)))
    					result.add(temp);
    			
    		}
    		
    	}
    	
    	return result;
    	
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}