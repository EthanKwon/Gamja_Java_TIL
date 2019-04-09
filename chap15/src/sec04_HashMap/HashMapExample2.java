package sec04_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student,Integer>(); 
		Map<Integer, Student> nameCode = new HashMap<Integer,Student>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 40);
		
		nameCode.put(50, new Student(3, "홍길동"));
		System.out.println("Value : " + nameCode.get(50));
		nameCode.put(50, new Student(3, "고길동"));
		System.out.println("Value : " + nameCode.get(50));
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("총 Entry 수 : " + nameCode.size());
		
	}
}
