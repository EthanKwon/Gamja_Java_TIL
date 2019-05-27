package openchallenge01;

public class MultiplyNumber {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=1000;i++) {
			sum += MultiplyNum(i);	
		}
		System.out.println(sum);
	}
	
	public static int numSize(int num) {
		if(num/100>=1) { //100의 자리수
			return 1;
		} else if(num/10>=1) { //10의 자리수
			return 2;
		} else {
			return 3; //1의 자리수
		}
	}
	
	public static int MultiplyNum(int i) {
		int mul =1; //해당 숫자의 자리수의 곱 변수
		switch (numSize(i)) {
		case 1 : int num1 = i%10;
				 int num10 = (i/10)%100;
				 int num100 = i/100;
				 mul = num1*num10*num100;
				 break;
		case 2 : num1 = i%10;
		 		 num10 = (i/10)%100;
		 		 mul = num1*num10;
		 		 break;
		case 3 : mul = i;
		}
		return mul; 
	}

}
