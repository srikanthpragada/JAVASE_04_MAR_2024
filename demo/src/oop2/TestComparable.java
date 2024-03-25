package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person other) {
		 return  this.age - other.age;
	}

}

public class TestComparable {

	public static void main(String[] args) {
		Person people[] = { new Person("Jack", 30), new Person("Ben", 20), new Person("Tom", 25) };

		Arrays.sort(people);

		for (var p : people)
			System.out.println(p);

	}
}
