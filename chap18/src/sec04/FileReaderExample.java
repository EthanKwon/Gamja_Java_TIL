package sec04;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:/"
				+ "Gamja_file/Egov/Gamja_Java_TIL/chap18/src/sec04/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[1000];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
