package sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "WriteExample2".getBytes();
		os.write(data,1,2);
		os.flush();
		os.close();
	}

}
