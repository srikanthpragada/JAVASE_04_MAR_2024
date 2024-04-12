package coll;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}

	@Override
	public int compareTo(Person other) {
		if (this.name.compareTo(other.name) == 0) {
			return this.age - other.age;
		} else
			return this.name.compareTo(other.name);
	}
}

public class TestPerson {

	public static void main(String[] args) {
		var people = new TreeSet<Person>();
		people.add(new Person("A", 30));
		people.add(new Person("B", 20));
		people.add(new Person("A", 30));
		people.add(new Person("C", 25));
		people.add(new Person("D", 30));

		for (var p : people) {
			System.out.println(p.toString());
			System.out.println(p.hashCode());
		}

	}

}
