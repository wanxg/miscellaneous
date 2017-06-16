package datastructureandalgorithms.javaprimer.exercise8n9;

public class Exercise8n9 {

	private static final String TEXT = "My name is Xiaolong Wan. Let's play together'''''''.";
	
	public static void main(String[] args) {

		

		System.out.println("The count of vowels in the given string \"" + TEXT + "\" is " + countOfVowels(TEXT));

		System.out.println(removePunctuationFrom(TEXT));

	}

	public static int countOfVowels(String test) {

		int count = 0;

		char[] array = test.toCharArray();

		for (int i = 0; i < array.length; i++) {

			if (String.valueOf(array[i]).equalsIgnoreCase("A") || String.valueOf(array[i]).equalsIgnoreCase("E")
					|| String.valueOf(array[i]).equalsIgnoreCase("I") || String.valueOf(array[i]).equalsIgnoreCase("O")
					|| String.valueOf(array[i]).equalsIgnoreCase("U"))

				count++;
		}

		return count;

	}

	public static String removePunctuationFrom(String s) {

		StringBuilder sb = new StringBuilder(s);

		int index;

		while ((index = sb.indexOf("'")) != -1) {
			sb.deleteCharAt(index);
		}

		return sb.toString();
	}

}
