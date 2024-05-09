package comparable;

import java.util.*;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String name() {
		return name;
	}
	public int age() {
		return age;
	}
	public boolean equals(Object obj) {
		return 	obj instanceof Person && 
				name.equals(((Person) obj).name) &&
				age == ((Person) obj).age;
	}
	public int hashCode() {
		return name.hashCode() + Integer.hashCode(age);
	}

	//Criterion: persons are compared using their ages. If they have the
	//            same age, then they are compared by their names.

	public int compareTo(Person p) {
		int result = Integer.compare(age, p.age);
		if (result == 0) {
			result = name.compareTo(p.name);
		}
		return result;
	}

	public static void main(String[] args) {
		Person p1 = new Person("John", 35);
		Person p2 = new Person("Peter", 22);
		System.out.println(p1.compareTo(p2));
	}

}