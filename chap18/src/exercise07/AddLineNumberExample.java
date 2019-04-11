package exercise07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath = "D:\\Gamja_file\\Egov\\Gamja_Java_TIL\\chap18\\src\\sec05/ObjectInputOutputStreamExample.java";
		
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufReader = new BufferedReader(fileReader);
		
		
		String data = new String();
		int num = 0;
		while( (data = bufReader.readLine())!= null) {
			num ++;
			System.out.print(num + ": ");
			System.out.println(data);
			
		}
		bufReader.close(); fileReader.close();
	}

}
