package interviewquestion;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		Integer[] array1 = { 1, 2, 3, 4 };

		Integer[] array2 = new Integer[] { 1, 2, 3, 4};

		System.out.println(equal(array1, array2));

	}

	public static <T, P> boolean equal(T[] array1, P[] array2) {

		if (array1.length != array2.length)

			return false;

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] != null && !array1[i].equals(array2[i]))
				return false;
			else if(array2[i] != null && !array2[i].equals(array1[i]))
				return false;

		}
		return true;
	}

}
