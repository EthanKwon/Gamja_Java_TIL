package openchallenge07;

public class PythagorasNumber {
	public static void main(String[] args) {
		PythagorasNumber();
	}
	
	public static void PythagorasNumber() {
		for(int i =2; i<999 ; i++) {
			for(int k=2; k<999 ; k++) {
				for(int m=3;m<999;m++) {
					if(i+k+m == 1000 && i<k && k<m) {
						if((i*i)+(k*k) == (m*m)) {
							System.out.println("찾았다! : " + i + " "+ k +" "+  m);
						}
					}
				}
			}
		}
	}

}

