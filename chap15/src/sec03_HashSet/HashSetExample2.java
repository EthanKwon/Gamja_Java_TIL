package sec03_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30,"010-1234-1234"));
		System.out.println(new Member("홍길동",30,"010-1234-1234").hashCode());
		
		set.add(new Member("홍길동",39,"010-1234-1234"));
		
		System.out.println(new Member("홍길동",30,"010-1234-1234").hashCode());
		
		System.out.println("총 객체수 : " + set.size());
	}
}
