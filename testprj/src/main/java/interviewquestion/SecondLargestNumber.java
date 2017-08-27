package interviewquestion;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {47498, 14526, 74562, 42681, 75283, 45796};
		
		System.out.print(getSecondLargest(numbers));
	}
	
	private static Integer getSecondLargest(int[] numbers){
		
		Integer largest = null;
		Integer second= null;
		
		for(int i=0;i<numbers.length;i++){
			
			if(largest==null){
				largest=numbers[i];
				continue;
			}
			else if(numbers[i]>largest){
				
				second = largest;
				
				largest = numbers[i];
				
			}
			else if(numbers[i]==largest)
				second = numbers[i];
			
			else {
				
				if(second==null) second=numbers[i];
				
				else if(numbers[i]>second)
					
					second=numbers[i];
			}
			
		}
		
		return second;
	}

}
