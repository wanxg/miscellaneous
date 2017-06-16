package interviewquestion;

public class PyramidOfNumbers {

	private static final int SIZE = 9;
	
	public static void main(String[] args) {

		StringBuffer[] sbArray = new StringBuffer[SIZE];

		for(int row = 0; row<SIZE; row++){
			
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j< row; j++) sb.append(" ");
			//for(int i = 0; i<SIZE-row;i++) sb.append("*"+" ");
			for(int i = 0; i<SIZE-row;i++) sb.append(SIZE-row+" ");
			sbArray[row] = sb;
		}
		
		for(int i = sbArray.length-1; i>=0;i--)
			System.out.println(sbArray[i]);
	}
}
