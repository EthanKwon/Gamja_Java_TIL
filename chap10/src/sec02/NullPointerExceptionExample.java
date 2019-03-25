package sec02;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString()); //지정된 주소값이 없어서 오류
	}

}
