package datastructureandalgorithms.javaprimer.exercise2;

public class GameEntry implements Cloneable{

	private int score;

	public GameEntry(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
}
