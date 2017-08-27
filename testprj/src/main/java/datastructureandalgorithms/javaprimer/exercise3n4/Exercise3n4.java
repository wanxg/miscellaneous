package datastructureandalgorithms.javaprimer.exercise3n4;

public class Exercise3n4 {

	public static void main(String[] args) {

		long n = 8;

		long m = 3;

		int i = 6;

		System.out.println("Is " + n + " a multiple of " + m + "? " + isMultiple(n, m));

		System.out.println("Is " + i + " even? " + isEven(i));
	}

	public static boolean isMultiple(long n, long m) {

		return n % m == 0 ? true : false;

	}

	public static boolean isEven(int i) {

		return i % 2 == 0 ? true : false;
	}

}
