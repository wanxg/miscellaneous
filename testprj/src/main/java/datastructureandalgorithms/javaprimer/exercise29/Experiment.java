package datastructureandalgorithms.javaprimer.exercise29;

public class Experiment {
	
	private static final long COUNT_OF_EVENT = 10000l;
	
	int countOfPeople;
	
	Experiment(int countOfPeople){
		
		this.countOfPeople = countOfPeople;
	}
	
	float getProbability(){
		
		float countOfTrueEvent = 0.0f;
		
		for(int i=0;i<COUNT_OF_EVENT;i++)
			
			if(new Event(countOfPeople).getResult()) countOfTrueEvent++;
		
		System.out.println("countOfTrueEvent is " + countOfTrueEvent);
		
		return countOfTrueEvent / COUNT_OF_EVENT;
	}

}
