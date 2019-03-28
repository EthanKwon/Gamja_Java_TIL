package openchallenge07;

public class PythagorasNumber {
	public static void main(String[] args) {
		PythagorasNumber();
	}
	
	public static void PythagorasNumber() {
		for(int i =1; i<333 ; i++) {
			for(int k=2; k<499 ; k++) {
				int m = 1000 - i - k;
						if((i*i)+(k*k) == (m*m)) {
							System.out.println("찾았다! : " + i + " "+ k +" "+  m);
						}
			}
		}
	}

}

