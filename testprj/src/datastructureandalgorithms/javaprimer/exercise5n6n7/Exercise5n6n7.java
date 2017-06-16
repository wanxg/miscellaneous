package datastructureandalgorithms.javaprimer.exercise5n6n7;

public class Exercise5n6n7 {

	public static void main(String[] args) {

		int n = 99;

		System.out.println("THe Sum of all positive integers less than or equal to " + n + " is: "
				+ sumOfAllPositiveIntegersFrom(n));

		System.out.println("THe Sum of all the odd positive integers less than or equal to " + n + " is: "
				+ sumOfAllOddPositiveIntegersFrom(n));
		
		System.out.println("THe Sum of all the squares of all positive integers less than or equal to " + n + " is: "
				+ sumOfSquaresOfPositiveIntegersFrom(n));
	}

	public static int sumOfAllPositiveIntegersFrom(int n) {

		int sum = 0;

		for (int i = n; i > 0; i--)
			sum += i;

		return sum;

	}

	public static int sumOfAllOddPositiveIntegersFrom(int n) {

		int sum = 0;

		for (int i = n; i > 0; i--) {
			if (i % 2 != 0)
				sum += i;
		}
		return sum;
	}

	public static int sumOfSquaresOfPositiveIntegersFrom(int n) {

		int sum = 0;

		for (int i = n; i > 0; i--)
			sum += i*i;

		return sum;

	}

}
