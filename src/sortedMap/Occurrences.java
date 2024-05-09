package sortedMap;

import java.util.*;

public class Occurrences {
	public static void main(String[] args) {
		String [] values = {"a", "b", "a", "b", "c", "c", "b", "c", "c", 
				"b", "a", "d", "a", "f", "e", "e", "f", "a"};
		SortedMap<String,Integer> mFrecs = new TreeMap<String,Integer>();
		for (String v : values) {
			// Increase the frequency. 1 if it is the first occurrence
			int frec = mFrecs.getOrDefault(v, 0);
			mFrecs.put(v, frec + 1);		
		}
		// Range of frequencies is shown
		SortedMap<String,Integer> subFrecs = mFrecs.subMap("b", "e");
		for (Map.Entry<String,Integer> entry : subFrecs.entrySet()) {
			String key = entry.getKey();
			int frec = entry.getValue();
			char[] bar = new char[frec];
			Arrays.fill(bar, '*');
			System.out.println(key+ ":\t" + new String(bar));
		}
	}	
}