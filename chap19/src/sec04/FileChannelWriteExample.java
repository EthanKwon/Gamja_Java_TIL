package sec04;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Temp/file.txt"); //파일의 위치
		Files.createDirectories(path.getParent()); 
		
		//파일 채널 생성(파일이 없다면 새로 생성)
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		String data = "안녕하세요";
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt : " + byteCount + " bytes written");
		
		fileChannel.close();
	}

}
