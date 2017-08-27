package datastructureandalgorithms.objectorienteddesign.project30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TextDocument extends AbstractDocument {
	
	public TextDocument(String source) {
		super(source);
	}
	
	

	@Override
	protected Map<String, Integer> getMostFrequentWords(int number) throws Exception {

		Map<String, Integer> mostFrequentWords = new HashMap<String, Integer>();

		if (this.getSource().isEmpty() || this.getSource() == null)

			System.out.println("Source is not provided.");

		else {
				URL url = new URL(this.getSource());
				URLConnection con = url.openConnection();
				con.setConnectTimeout(60000);
				con.setReadTimeout(60000);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String curLine;

				Map<String, Integer> frequency = new HashMap<String, Integer>();

				while ((curLine = br.readLine()) != null) {

					String[] words = curLine.split("\\W+");

					for (int i = 0; i < words.length; i++) {

						if (words[i].isEmpty())
							continue;

						if (frequency.get(words[i]) == null)
							frequency.put(words[i], 1);

						else
							frequency.put(words[i], frequency.get(words[i]) + 1);

					}
				}

				br.close();

				mostFrequentWords = frequency.entrySet().stream()
						.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(number)
						.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
				
				
				for(Map.Entry<String, Integer> entry : mostFrequentWords.entrySet()){
					this.setMaxFrequency(entry.getValue());
					break;
				}
		}

		return mostFrequentWords;
	}

}
