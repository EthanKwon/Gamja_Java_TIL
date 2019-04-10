package sec05_Comparable;

import java.util.Objects;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.age<o.age) return -1;
		else if(this.age > o.age)return -1;
		else return 0;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			return this.name.equals(person.name) && (this.age == person.age);
		} else return false;
	}
	
	

}
