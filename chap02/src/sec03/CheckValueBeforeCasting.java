package sec03;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		System.out.print(Byte.MIN_VALUE + "\t");
		System.out.println(Byte.MAX_VALUE);
		System.out.print(Short.MIN_VALUE + "\t");
		System.out.println(Short.MAX_VALUE);
		System.out.print(Integer.MIN_VALUE + "\t");
		System.out.println(Integer.MAX_VALUE);
		System.out.print(Long.MIN_VALUE + "\t");
		System.out.println(Long.MAX_VALUE);
		System.out.print(Float.MIN_VALUE + "\t");
		System.out.println(Float.MAX_VALUE);
		System.out.print(Double.MIN_VALUE + "\t");
		System.out.println(Double.MAX_VALUE);
	}
}
