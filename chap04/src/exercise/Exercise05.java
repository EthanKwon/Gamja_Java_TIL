package exercise;

public class Exercise05 {
	public static void main(String[] args) {
		for(int i =1; i <= 10 ; i ++ ) {
			for (int k =1; k <=10 ; k ++ ) {
				if (4*i + 5*k == 60)
					System.out.println("(" + i + "," + k + ")");
			}
		}
	}

}
