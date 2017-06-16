package newtest;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        
        StringBuilder sb = new StringBuilder(word);
        
        if(word.equalsIgnoreCase(sb.reverse().toString()))
        	return true;
        else 
        	return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}