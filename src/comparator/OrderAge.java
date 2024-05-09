package comparator;

import java.util.Comparator;

import comparable.Person;

public class OrderAge implements Comparator<Person> {
	// Person objects are compared using age
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.age(),p2.age());
	}
}
