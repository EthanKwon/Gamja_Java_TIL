package exercise;

public class Exercise06 {
	public static void main(String[] args) {
		for( int i = 1 ; i <= 5 ; i ++) {
			String star = "";
			for (int k = 1; k <= 5; k++) {
				star += "*";
				if (k == i) break;
			}
			System.out.println(star);
		}
	}

}
