package comparator;

import java.util.Comparator;

import comparable.Person;

public class NameThenAge implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		int result = Integer.compare(p1.age(), p2.age());
		if (result == 0) {
			result = p1.name().compareTo(p2.name());
		}
		return result;
	}
}
