package datastructureandalgorithms.javaprimer.exercise29;


public class Event {
	
	private int countOfPeople;
	
	private Birthday[] birthdays;

	Event(int countOfPeople){this.countOfPeople=countOfPeople;}
	
	public boolean getResult(){
		
		this.birthdays = generateBirthday(countOfPeople);
		
		for(int i = 0;i<birthdays.length-1;i++){
			for (int j = i+1;j<birthdays.length;j++)
				if(birthdays[i].toString().equals(birthdays[j].toString())){
					return true;
				}
					
		}
		return false;
	}
	
	public Birthday[] generateBirthday(int countOfPeople) {

		Birthday[] birthdays = new Birthday[countOfPeople];

		int whichMonth;
		int numberOfDays;
		Birthday bd;
		for (int i = 0; i < countOfPeople; i++) {
			whichMonth = (int) (Math.random() * 13);
			bd = new Birthday();
			bd.month = MONTH.values()[whichMonth];
			numberOfDays = bd.month.numberOfdays;
			bd.day = ((int) (Math.random() * numberOfDays)) + 1;
			birthdays[i] = bd;
		}
		return birthdays;
	}
	
}
