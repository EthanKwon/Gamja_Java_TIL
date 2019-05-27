package sec02_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<String> list2 = Arrays.asList("1","2","3");
		for(String value : list2) {
			System.out.println(value);
		}
	}
}
