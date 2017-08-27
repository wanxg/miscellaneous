package interviewquestion;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println(isArmstrongNumber(54748));
	}

	public static boolean isArmstrongNumber(int i) {

		int numberOfDigits = String.valueOf(i).length();

		int[] digits = String.valueOf(i).chars().map(item -> {

			return (char)item -'0';

		}).toArray();

		int sum = 0;

		for (int j = 0; j < digits.length; j++)

			sum = sum + (int) Math.pow(digits[j], numberOfDigits);

		if (sum == i)
			return true;

		else
			return false;
	}
}
