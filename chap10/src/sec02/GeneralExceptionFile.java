package sec02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//메모장으로 문장 옮기기

public class GeneralExceptionFile {
	public static void main(String[] args) {
		String path = "D:\\Gamja_file\\Egov\\Gamja_Java_TIL\\chap09\\src\\sec02\\test.txt";
		try { // try-catch문을 작성해야 오류가 뜨지 않는다. (생략할 경우 프로그램 실행 안됨)
			File file = new File(path);
			FileWriter fw = new FileWriter(file,true);
			fw.write("A quick brown fox");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
