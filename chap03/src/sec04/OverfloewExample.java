package sec04;

public class OverfloewExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		long x1 = 1000000L;
		int y1 = 1000000;
		long z1 = x1 * y1;
		
		System.out.println(z);
		System.out.println(z1);
	}

}
