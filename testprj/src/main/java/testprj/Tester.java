package testprj;

import java.util.*;

import javax.annotation.PostConstruct;

import testcdi.Chef;

public class Tester {
	
	
	int i;

	public static void main(String[] args) throws CloneNotSupportedException{
		
		
		Inner i = new Inner();
		
		
		
		String s = "";
		
		assert s!=null;
		
		System.out.println(args[0]);
		
		print(args[0],2F,new Date());
		
		/**
		 * 
		 *  List
		 * 
		 * 
		 */
		System.out.println("------------------List-------------------");
		
		//List<Integer> list = Arrays.asList(1,4,3,2,5);
		
		List<Integer> list = new ArrayList<Integer>(){
			

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				
				add(1);
				add(4);
				add(3);
				add(2);
				add(5);
				
			}
		};
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		list.forEach(item->{
			
		});
		
		Collections.unmodifiableList(list).forEach(System.out::print);
		
		
		System.out.println();
		
		System.out.println("------------------Set-------------------");
		
		/**
		 *  Set
		 * 
		 */
		
		SortedSet<String> set=new TreeSet<String>();
		set.add("c");
		set.add("b");
		set.add("a");
		
		set.stream().forEach(System.out::println);
		
		set.forEach(item->{
			
		});
		
		
		/**
		 *  map
		 * 
		 */
		
		System.out.println("------------------Map-------------------");
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		m.put("h1", 1);
		
		m.put("h2", 2);
		
		m.entrySet().forEach(entry->{
			
			System.out.print(entry.getKey()+"->");
			System.out.println(entry.getValue());
			
		});
		
		m.forEach((key,value)->{
			
			System.out.print(key+"->");
			System.out.println(value);
			
		});
		
		System.out.println(m);
		
		
		/**
		 *  Thread
		 */
		
		System.out.println("------------------Thread-------------------");
		
		Thread t = new Thread(()->{
			System.out.println("I am running again");
		});
		
		t.start();
		
		
		t = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("I am running");
			}
			
		});
		
		t.start();
		
		Book b1 = new Book();
		b1.setName("kindbuch");
		
		
		Book b2 = (Book)b1.clone();
		
	
		System.out.println(b1);
		System.out.println(b2);
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		System.out.println(sb.reverse().toString());  
		
		StringBuilder sbb = new StringBuilder("edf");
		
		System.out.println(sbb.reverse().toString());  
		
		System.out.println(new Tester().i);
		
	}
	
	@PostConstruct
	private void init(){
		System.out.println("init()");
	}
	
	
	public static <T> void print(T... args){
		
		
		
		System.out.println("how many arguments? " + args.length);
		
		for(int i=0;i<args.length;i++)
			
			System.out.println(args[i]);
		
	}
	
}
