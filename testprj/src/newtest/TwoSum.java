package newtest;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {

		int[] result = null;

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < list.length; i++) {

			if(map.get(list[i])!=null){
				result = new int[]{map.get(list[i]),i};
				break;
			}
					
			else 
				map.put(sum - list[i],i);

		}

		
		return result;

	}

	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
		System.out.println(indices[0] + " " + indices[1]);
	}
}