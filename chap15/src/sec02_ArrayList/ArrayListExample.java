package sec02_ArrayList;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Serlet/JSP");
		list.add(2,"DataBase");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		for(String l : list) {
			System.out.println(l);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("Java");
		
		for(int i =0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
			
		}
	}
}
