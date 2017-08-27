package designpattern.singleton;

class MyThread extends Thread {

	public void run() {

		
		MySingleton s = MySingleton.getInstance();
		
		synchronized(s){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.increaseValue();
			System.out.println("Singleton value is " + s.getValue()+ " Current time is " + System.currentTimeMillis());
			
			
			
		}

	}

}

public class MyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Current time is " + System.currentTimeMillis());
		
		MyThread[] threads = {new MyThread(), new MyThread(),new MyThread(),new MyThread(),new MyThread()};
		
		
		for(int i = 0; i<threads.length;i++)
			
			threads[i].start();

	}

}
