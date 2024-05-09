package sortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
	
}

public class SortingLists {
	
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		
		ls.addAll(List.of("mouthfeel", "karen", "pivot", "absolutely", "gaslighting", "unprecedented",
				"amazing", "irregardless", "totes", "bromance"));
		
		System.out.println("Original list:\n" + ls.toString());
		
		ls.sort(null);
		
		System.out.println("\nList sorted by natural order:\n" + ls.toString());
		
		ls.sort(new MyComparator());
		
		System.out.println("\nList sorted by 'MyCompator' comparator:\n" + ls.toString());
		
		Collections.sort(ls,null);
		
		System.out.println("\nList sorted by natural order:\n" + ls.toString());
		
		Collections.sort(ls, new MyComparator());
		
		System.out.println("\nList sorted by 'MyCompator' comparator:\n" + ls.toString());


	}

}
