package openchallenge02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class HexaDump {
	
	public static void main(String[] args) throws Exception{
		
		// **실행을 원하시면 자신이 원하는 파일의 주소를 바꿔 넣어 주세요.**
		//String filePath = "D:\\Gamja_file\\Egov\\Gamja_Java_TIL\\chap18\\bin\\sec05/InputStreamReaderExample.class";

		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력해 주세요. : ");
		String fileName  = scan.nextLine();
		
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis); 
		
		int data;
		int num = 1;
		StringBuilder str = new StringBuilder();
		
		
		System.out.println("\n----------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t[결과물 출력]");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.printf("\n %08X : ",num);
		
		while( (data = bis.read())!=-1) {
			System.out.printf("%02X ",data); // 1바이트의 값을 16진수로 출력
			if(data > 64 && data < 90 ) str.append((char)data); //A-Z이면 문자열 그대로 저장
			else if(data > 96 && data < 123 ) str.append((char)data); // a-z이면 문자열 그대로 저장
			else str.append("."); //나머지 문자열은 모두 '.'처리
			
			if(num%16 == 0) { //16개의 1바이트 값을 출력하고 나면 맨뒤에 문자열을 출력하고 다음줄에 라인넘버를 만든다.
				System.out.print("\t" +  str.toString());
				str.delete(0, str.length());
				System.out.printf("\n %08X : ",num);
			}
			
			if (num%8 == 0 && num%16 != 0) { // 8번째와 9번째 사이에 구분을 위한 빈칸을 넣는다. 
				System.out.print(" ");
			}
			
			num ++;
			
		}
		//마지막 줄 문자열 위치 맞추기 (개수가 정해져있지 않아 개수에 따라 빈칸이 달라지게 조정)
		for(int i=0;i<16-(num-1)%16 ;i++) {
			System.out.print("   ");
			if (num%8==0) System.out.println("    ");
		}
		//마지막 줄 문자열 출력
		System.out.print("\t" +  str.toString());
		str.delete(0, str.length());
	
		
		bis.close(); fis.close();
		scan.close();
	}

}
