package testprj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Inner {
	
	private final List<Integer> list = new ArrayList<Integer>();

	 {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	 }
	 
	 public List<Integer> getList(){
		 
		 return Collections.unmodifiableList(list);
		 
		 //return list;
	 }

	@Override
	public String toString() {
		return "Inner list=" + list;
	}
	 
}


public class Temp {


	public static void main(String[] args) {

		Inner inner = new Inner();
		
		System.out.println(inner);
		
		List<Integer> list = inner.getList();
		

		list.add(7);

		System.out.println(inner);

	}

}
