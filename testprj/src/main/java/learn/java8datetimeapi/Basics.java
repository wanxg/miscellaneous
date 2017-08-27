package learn.java8datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Locale;

public class Basics {
	
	
	

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Current date: " + date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Current time: " + time);
		
		LocalDateTime now = LocalDateTime.of(date, time);
		
		System.out.println(now.format(DateTimeFormatter.ofPattern("uuuu年M月d日 H点m分s秒", Locale.CHINA)));
		
		
		String s = null;
		
		
		System.out.println();
		
		
		

	}

}
