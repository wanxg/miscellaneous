package datastructureandalgorithms.javaprimer.exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static Object input;

	public static void main(String[] args) {

		inputAllBaseTypes();
	}

	public static void inputAllBaseTypes() {

		Scanner sc = new Scanner(System.in);

		
		// type @ to quit the program
		while (!"@".equals(input)) {
			System.out.print("Please input a base type value: ");

			if (sc.hasNextByte()){
				input = sc.nextByte();
				System.out.println("The byte value (8 bit)(-128,127) is :" + input);
			}
			
			else if (sc.hasNextShort()){
				input = sc.nextShort();
				System.out.println("The short value (16 bit)(-32768,32767) is :" + input);
			}
			
			else if (sc.hasNextInt()){
				input = sc.nextInt();
				System.out.println("The int value (32 bit) (-2147483648,2147483647) is :" + input);
			}
			
			else if (sc.hasNextLong()){
				input = sc.nextLong();
				System.out.println("The long value (64 bit) is :" + input);
			}
			
			else if (sc.hasNextFloat()){
				input = sc.nextFloat();
				System.out.println("The float value is :" + input);
			}
			
			else if (sc.hasNextDouble()){
				input = sc.nextDouble();
				System.out.println("The double value is :" + input);
			}
			
			else if (sc.hasNextBoolean()){
				input = sc.nextBoolean();
				System.out.println("The boolean value is :" + input);
			}
			
			else
				input = sc.next();
		}
		System.out.println("Program derminated!");
		sc.close();
	}

}
