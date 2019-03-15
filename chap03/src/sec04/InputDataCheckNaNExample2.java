package sec04;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput ="NaN";
		double val = Double.valueOf(userInput); //숫자로 변환은 "변수형.valueOf"를 사용한다.
		
		String num = "1235";
		int val1 = Integer.valueOf(num);
		System.out.println(val1);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
