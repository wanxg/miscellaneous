package datastructureandalgorithms.objectorienteddesign.project30;

import java.util.Map;

public abstract class AbstractDocument{
	
	private String source;
	
	private int maxFrequency;
	
	public AbstractDocument(String source){
		
		this.source = source;
	}
	
	public int getMaxFrequency() {
		return maxFrequency;
	}



	public void setMaxFrequency(int maxFrequency) {
		this.maxFrequency = maxFrequency;
	}



	public String getSource() {
		return source;
	}



	protected abstract Map<String, Integer> getMostFrequentWords(int number) throws Exception;

}
