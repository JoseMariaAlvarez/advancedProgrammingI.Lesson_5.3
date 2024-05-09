package sortedSet;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
	
}

public class SortedSetMethods {

	public static void main(String[] args) {

		SortedSet<String> ss = new TreeSet<>();
		
		ss.addAll(Set.of("mouthfeel", "karen", "pivot", "absolutely", "gaslighting", "unprecedented",
				"amazing", "irregardless", "totes", "bromance"));

		System.out.println("Original set with natural order:");
		System.out.println(ss.toString());
		System.out.println("\nElements less than \"irregardless\":");
		System.out.println(ss.headSet("irregardless"));
		System.out.println("\nElements greater than or equal to \"irregardless\":");
		System.out.println(ss.tailSet("irregardless"));
		System.out.println("\nElements in the range from \"gaslighting\" to \"mouthfeel\":");
		System.out.println(ss.subSet("gaslighting", "mouthfeel"));
		
		System.out.println("Set after removing \"karen\":");
		ss.remove("karen");
		System.out.println("\nElements less than \"irregardless\":");
		System.out.println(ss.tailSet("irregardless"));
		System.out.println("\nElements in the range from \"gaslighting\" to \"mouthfeel\":");
		System.out.println(ss.subSet("gaslighting", "mouthfeel"));

		System.out.println("\nFirst (lowest) element:");
		System.out.println(ss.first());

		System.out.println("\nLast (highest) element:");
		System.out.println(ss.last());

		System.out.println("\nComparator:");
		System.out.println(ss.comparator());

		ss = new TreeSet<>(new MyComparator());
		ss.addAll(Set.of("mouthfeel", "karen", "pivot", "absolutely", "gaslighting", "unprecedented",
				"amazing", "irregardless", "totes", "bromance"));
		System.out.println("\nSet with new order:");
		System.out.println(ss.toString());

		
		ss.addAll(Set.of("mouthfeel", "karen", "pivot", "absolutely", "gaslighting", "unprecedented",
				"amazing", "irregardless", "totes", "bromance"));

		System.out.println("\nComparator:");
		System.out.println(ss.comparator());
		Comparator<? super String> c = ss.comparator();
		int comparison = c.compare("gaslighting", "karen");
		System.out.println(comparison);

	}

}
