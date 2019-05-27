package sec02;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			//Run -> Run Configurations로 들어가 Argument 탭에 "배열 인덱스"라고 입력함
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2); //데이터가 없어서 오류
			
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1  값2");
		}
		
	}
}
