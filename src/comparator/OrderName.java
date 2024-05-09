package comparator;

import java.util.Comparator;

import comparable.Person;

public class OrderName implements Comparator<Person> {
    // Person objects are compared using name
    public int compare(Person p1, Person p2) {
        return p1.name().compareTo(p2.name());
    }
}
