package testprj;

import java.util.Date;

public class MultiThreading {

	public static void main(String[] args) {

		long currentTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			
			final int j = i;
			
			Thread t = new Thread(() -> {
				System.out.println("Thread " + j + ":");
				System.out.println("Current date/time" + new Date());
			},String.valueOf(i));

			t.start();
		}
		System.out.println("Time spent: " + (System.currentTimeMillis() - currentTime));
	}

}
