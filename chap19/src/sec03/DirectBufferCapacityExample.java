package sec03;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferCapacityExample {
	public static void main(String[] args) {
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
		System.out.println("저장용량: " + byteBuffer.capacity() + "바이트");
		
		CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer(); //char = 2byte
		System.out.println("저장용량: " + charBuffer.capacity() + "문자");
		
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer(); //int = 4byte
		System.out.println("저장용량: "+ intBuffer.capacity() + "정수");
	}

}
