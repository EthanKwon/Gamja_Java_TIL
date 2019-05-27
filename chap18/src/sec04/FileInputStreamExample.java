package sec04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/"
					+ "Gamja_file/Egov/Gamja_Java_TIL/chap18/src/sec04/FileInputStreamExample.java");
			int data;
			while((data= fis.read())!=-1) {
				System.out.print((char)data);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
