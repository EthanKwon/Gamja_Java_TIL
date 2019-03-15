package sec03;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

}
