package openchallenge02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NameList {
	public static void main(String[] args) {
		String nameList = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,"
				+ "김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		
		System.out.println("'이'씨 성을 가진 사람 수 : " + sameLastName("이",nameList));
		System.out.println("'김'씨 성을 가진 사람 수 : " + sameLastName("김",nameList));
		System.out.println("'이재영'이라는 이름을 가진 사람 수 : " + sameName("이재영",nameList));
		System.out.println(" < 중복된 이름 제거 > ");
		sameNameDelete(nameList);
		System.out.println();
		System.out.println(" < 중복된 이름 제거 - 정렬 > ");		
		sameNameDeleteSort(nameList);
		
	}
	
	static int sameLastName(String lastName, String nameList) {
		int count =0;
		List<String> nameLists = new ArrayList<String>(); 
		StringTokenizer names = new StringTokenizer(nameList, ",");
		
		while(names.countTokens() >0) {
			nameLists.add(names.nextToken());
		}
		for(String name: nameLists) {
			if(name.indexOf(lastName)!=-1) {
				count ++;
			}
		}
		return count;
	}
	
	static int sameName(String n, String nameList) {
		int count =0;
		List<String> nameLists = new ArrayList<String>(); 
		StringTokenizer names = new StringTokenizer(nameList, ",");
		
		while(names.countTokens() >0) {
			nameLists.add(names.nextToken());
		}
		
		for(String name: nameLists) {
			if(name.indexOf(n)!=-1) {
				count ++;
			}
		}
		return count; 
	}
	
	static void sameNameDelete(String nameList) {
		Set<String> nameLists = new HashSet<String>(); 
		StringTokenizer names = new StringTokenizer(nameList, ",");
		
		while(names.countTokens() >0) {
			nameLists.add(names.nextToken());
		}
		
		for(String name : nameLists) {
			System.out.print(name + " ");
		}
	}
	
	static void sameNameDeleteSort(String nameList) {
		TreeSet<String> nameLists = new TreeSet<String>(); 
		StringTokenizer names = new StringTokenizer(nameList, ",");
		
		while(names.countTokens() >0) {
			nameLists.add(names.nextToken());
		}
		
		for(String name : nameLists) {
			System.out.print(name + " ");
		}
	}

}
