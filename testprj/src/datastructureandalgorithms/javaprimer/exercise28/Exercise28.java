package datastructureandalgorithms.javaprimer.exercise28;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise28 {

	private static final String SENTENCE = "I will never spam my friends again.";

	private static final char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	private static final int TIMES = 100;
	private static final int COUNT_OF_TYPOS = 8;

	public static void main(String[] args) {

		punish(SENTENCE);

	}

	public static void punish(String sentence) {

		int length = (SENTENCE.replaceAll(" ", "").length()) - 2;

		int countOfCharacters = length * TIMES;

		String[] text = new String[TIMES];

		for (int i = 0; i < TIMES; i++)

			text[i] = new String(SENTENCE);

		int[] typoPositions = new int[COUNT_OF_TYPOS];

		int[] linesOfTypo = new int[COUNT_OF_TYPOS];

		int[] positionInLine = new int[COUNT_OF_TYPOS];

		for (int i = 0; i < COUNT_OF_TYPOS; i++) {

			// start from 1
			typoPositions[i] = (int) (Math.random() * countOfCharacters + 1);

			// start from 0
			linesOfTypo[i] = typoPositions[i] / length;

			// start from 0
			positionInLine[i] = typoPositions[i] % length;
		}

		for (int i = 0; i < COUNT_OF_TYPOS; i++) {

			char[] typoLine = text[linesOfTypo[i]].toCharArray();

			int position = positionInLine[i];

			if (position == 0){
				Array.setChar(typoLine, typoLine.length - 2, generateRandomChar());
				text[linesOfTypo[i]] = String.valueOf(typoLine);
			}
			else {

				typoLine = text[linesOfTypo[i]].toCharArray();

				for (int j = 1; j < typoLine.length; j++) {

					if (typoLine[j] == ' ')
						continue;
					else

						position--;

					if(position==0){
						
						Array.setChar(typoLine, j, generateRandomChar());
						
						text[linesOfTypo[i]] = String.valueOf(typoLine);
					}
				}
			}

		}

		System.out.println(Arrays.toString(typoPositions));

		System.out.println(Arrays.toString(linesOfTypo));

		System.out.println(Arrays.toString(positionInLine));
		
		for(int i = 0; i<text.length;i++)
			
			System.out.println(text[i]);

	}

	private static char generateRandomChar() {
		
		char c = ALPHABET[(int) (Math.random() * 26)];
		
		System.out.println("generated random char is " + String.valueOf(c));
		
		return c;
		
	}

}
