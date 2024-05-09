package sortedMap;

import java.util.*;

public class Positions{
	public static void main(String[] args) {
		String [] values = {"5", "4", "32", "3", "4", "3", "2", "3", "4", "2", "5", "2", "3"};
		SortedMap<String, List<Integer>> mPos = new TreeMap<>();
		for (int i = 0; i < values.length; i++) {
			// The list associated to args[i] is searched
			List<Integer> lPos = mPos.get(values[i]);
			if (lPos == null) {
				lPos = new ArrayList<Integer>(); 	// lPos is created
				mPos.put(values[i], lPos);			// and it is assigned to num in mPos 
			} 
			// At this point, lPos exists and it is the value for the key ‘num’ in mPos
			lPos.add(i);  		//thus, the position can be added
		}
		for (Map.Entry<String, List<Integer>> entry : mPos.entrySet()) {
			String key = entry.getKey();
			List<Integer> lPos = entry.getValue();
			System.out.println(key + ":\t" + lPos);
		}
	}	
}
