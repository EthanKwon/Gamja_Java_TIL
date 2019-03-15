package sec04;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x =5;
		double y =0.0;
		int y1 =0;
		
		double z = x/y ;
//		double z = x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		System.out.println(z +2);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
		
		try {
			int z1 = x % y1; 
			System.out.println("z : " + z1 );
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
		
	}

}
