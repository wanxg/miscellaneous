package datastructureandalgorithms.javaprimer.exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static Object input;

	public static void main(String[] args) throws Exception {

		GameEntry[] arrayA = {new GameEntry(100),new GameEntry(200),new GameEntry(300),new GameEntry(400), new GameEntry(500)};
		
		GameEntry[] arrayB = arrayA.clone();
		
		GameEntry[] arrayC = arrayA;
		
		System.out.println("arrayA[4] is " + arrayA[4]);
		System.out.println("arrayB[4] is " + arrayB[4]);
		
		arrayA[4].setScore(550);
		
		System.out.println("arrayA[4] is " + arrayA[4].getScore());
		System.out.println("arrayB[4] is " + arrayB[4].getScore());
	
		System.out.println("Is arrayA arrayB? " + (arrayA==arrayB));
		System.out.println("does arrayA equal to arrayB? " + (arrayA.equals(arrayB)));
		
		
		GameEntry geA = arrayA[0];
		
		System.out.println("arrayA[0] is " + arrayA[0].getScore());
		
		GameEntry geB = (GameEntry)geA.clone();
		
		System.out.println("Is geA geB? " + (geA==geB));
		System.out.println("does geA equal to geB? " + (geA.equals(geB)));
		
		geA.setScore(150);
		
		System.out.println("arrayA[0] is modifed to " + geA.getScore());
		System.out.println("clone of arrayA[0] is " + geB.getScore());
		
		System.out.println("Is geA geB? " + (geA==geB));
		System.out.println("does geA equal to geB? " + (geA.equals(geB)));
		
	}

	
}
