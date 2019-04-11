package openchallenge02;

import java.io.FileInputStream;

public class HexaDump {
	
	public static void main(String[] args) throws Exception{
		
		// **실행을 원하시면 자신이 원하는 파일의 주소를 바꿔 넣어 주세요.**
		String filePath = "D:\\Gamja_file\\Egov\\Gamja_Java_TIL\\chap18\\bin\\sec05/InputStreamReaderExample.class";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		int data;
		int num = 1;
		StringBuilder str = new StringBuilder();
		
		
		System.out.println("\t\t\t\t[결과물 출력]");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.printf("\n %08X : ",num);
		
		while( (data = fis.read())!=-1) {
			System.out.printf("%02X ",data); // 1부터 시작 
			if(data > 64 && data < 123 ) str.append((char)data);
			else str.append(".");
			
			if(num%16 == 0) {
				System.out.print("\t" +  str.toString());
				str.delete(0, str.length());
				System.out.printf("\n %08X : ",num);
			}
			
			if (num%8 == 0 && num%16 != 0) {
				System.out.print(" ");
			}
			
			num ++;
			
		}
	
		
		fis.close();
	}

}
