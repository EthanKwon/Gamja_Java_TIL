package exam11;

public class Summation {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=1000 ; i++) {
			if(i%7 == 0) sum += i; 
		}
		System.out.println("7의 배수의 총합 : " + sum);
	}

}
