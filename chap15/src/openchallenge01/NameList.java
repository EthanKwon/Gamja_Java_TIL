package openchallenge01;

import java.util.Arrays;
import java.util.StringTokenizer;

public class NameList {
	public static void main(String[] args) {
		String nameList = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,"
				+ "김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		
		System.out.println("'이' 씨 성을 가진 사람 수 : " + countLastName("이",nameList));
		System.out.println("'김' 씨 성을 가진 사람 수 : " + countLastName("김",nameList));
		System.out.println("'이재영'씨의 수 : " + sameName("이재영",nameList));	
		System.out.println("< 중복된 이름 제거 >");
		sameNameDelete(nameList);
		System.out.println();
		System.out.println("< 중복된 이름 제거 - 정렬>");
		sameNameDeleteSort(nameList);
		
	}
	
	//성씨 같은 사람의 수 세기
	static int countLastName(String lastName, String nameList) {
		StringTokenizer nameToken = new StringTokenizer(nameList,",");
		int count = 0;
		while(nameToken.countTokens()>0) {
			if(nameToken.nextToken().indexOf(lastName) != -1) {
				count ++;
			}
		}
		return count;
	}
	
	//중복된 이름 찾기
	
	static int sameName(String Name, String nameList) {
		StringTokenizer nameToken = new StringTokenizer(nameList,",");
		int count = 0;
		while(nameToken.countTokens()>0) {
			if(nameToken.nextToken().indexOf(Name) != -1) {
				count ++;
			}
		}
		return count;
	}
	
	//중복된 이름 지우기
	static void sameNameDelete(String nameList) {
		StringTokenizer nameToken = new StringTokenizer(nameList,",");
		StringBuilder nameLists = new StringBuilder();
		while(nameToken.countTokens()>0) {
			String name = nameToken.nextToken();
			if(nameLists.indexOf(name)== -1) {
				nameLists.append(name);
				System.out.print(name +" ");
			}
			
		}
	}
	
	static void sameNameDeleteSort(String nameList) {
		StringTokenizer nameToken = new StringTokenizer(nameList,",");
		StringBuilder nameLists = new StringBuilder();
		int count = 0;
		while(nameToken.countTokens()>0) {
			String name = nameToken.nextToken();
			if(nameLists.indexOf(name) == -1) {
				nameLists.append(name);
				nameLists.append(",");
				count ++;
			}
		}
		String[] nameSort = new String[count]; //count는 중복을 제거한 이름의 개수
		nameToken = new StringTokenizer(nameLists.toString(),",");
		for(int i =0; i<count ; i++) {
			nameSort[i] = nameToken.nextToken();
		}
		for(int i =0; i<count-1 ; i++) {
			for(int k=i+1; k<count; k++) {
				if(nameSort[i].compareTo(nameSort[k]) > 0) {
					String temp = nameSort[i];
					nameSort[i] = nameSort[k];
					nameSort[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nameSort));
	}

}
