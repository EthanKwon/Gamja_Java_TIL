package sec03;

import java.nio.ByteBuffer;

public class BufferSizeExample {
	public static void main(String[] args) {
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(1500 * 1024 * 1024);
		System.out.println("다이렉트 버퍼가 생성되었습니다.");
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(1500 * 1024 * 1024);
		System.out.println("넌 다이렉트 버퍼가 생성되었습니다.");
	}

}
