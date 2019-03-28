package openchallenge05;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CaesarFunction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 문자와 n을 입력하세요. > ");
		
		String strAndNum = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(strAndNum," ");
		
		String str = st.nextToken();
		int num = Integer.parseInt(st.nextToken());
		
		System.out.println("문자 : " + str);
		CaeserFunction(str,num);
		
		scan.close();
	}
	
	public static void CaeserFunction(String str, int num) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<str.length();i++) {
			char newAlphabet = (char) (str.charAt(i) + num);
			sb.append(newAlphabet);
		}


		System.out.println("해당 문자의 시저 암호 : " + sb);
	}
}
