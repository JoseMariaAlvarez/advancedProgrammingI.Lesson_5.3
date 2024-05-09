package comparator;

public class Student {
	private String name;					
	private double mark;	
	public Student(String n, double m) {
		name = n;
		mark = m;
	}	
	public String getName() {
		return name;
	}
	public double getMark(){
		return mark;
	}
	public String toString() {
		return "(" + name + ", " + mark + ")";
	}
}