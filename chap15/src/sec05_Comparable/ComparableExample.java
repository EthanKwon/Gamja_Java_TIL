package sec05_Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("김자바",38));
		treeSet.add(new Person("박지원",29));
		treeSet.add(new Person("박지원",26));
		treeSet.add(new Person("박지원",29));
		
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
		
	}

}
