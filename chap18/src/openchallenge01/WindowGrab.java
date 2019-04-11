package openchallenge01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class WindowGrab {
	public static void main(String[] args) throws Exception{
		
		// **실행을 원하시면 자신이 원하는 파일의 주소를 바꿔 넣어 주세요.**
		String filePath = "D:\\Gamja_file\\Egov\\Gamja_Java_TIL\\chap18\\src\\sec05/ObjectInputOutputStreamExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader bfr = new BufferedReader(fr);
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾고자 하는 단어 : ");
		String data = new String();
		String word  = scan.nextLine();
		
		
		System.out.println("\n               [찾은 결과] ");
		System.out.println("--------------------------------------------");
		
		while((data = bfr.readLine())!= null) {
			if(data.indexOf(word) != -1) {
				System.out.print(num + ": ");
				System.out.println(data.toString());
				}
			num ++;
		}
		
		bfr.close(); fr.close();
		scan.close();
	}

}
