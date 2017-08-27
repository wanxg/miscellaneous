package datastructureandalgorithms.javaprimer.exercise18;

import java.util.Arrays;

public class Exercise18 {

	public static void main(String[] args) {

		int[] vector = {1,2,3};
		
		int p = 45;

		System.out.println(p +"-norm value of vector "+Arrays.toString(vector)+" is : " + norm(vector,p));
		
		System.out.println(2 +"-norm value of vector "+Arrays.toString(vector)+" is : " + norm(vector));

	}

	public static double norm(int[] vector, int p) {

		int sum = 0;

		for(int i = 0; i<vector.length;i++){
			
			sum+=Math.pow(vector[i],p);
		
		}
		
		double root = 1 / (double)p;

		return Math.pow((long)sum, root);

	}

	public static double norm(int[] vector) {
		return norm(vector,2);
	}

}
