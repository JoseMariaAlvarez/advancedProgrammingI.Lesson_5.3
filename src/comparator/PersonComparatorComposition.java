package comparator;

import java.util.Comparator;

import comparable.Person;

public class PersonComparatorComposition {

	public static void main(String [] args) {
		Person p1 = new Person("Juan", 35);
		Person p2 = new Person("Pedro", 22);
		Comparator<Person> op = 
				new OrderAge().thenComparing(new OrderName());
		System.out.println(op.compare(p1, p2));
		Comparator<Person> op2 = 
				new OrderName().reversed().thenComparing(new OrderAge());
		System.out.println(op2.compare(p1, p2));
		Comparator<Person> op3 = 
				new OrderName().reversed().thenComparing(Comparator.naturalOrder());
		System.out.println(op3.compare(p1, p2));
	}
}
