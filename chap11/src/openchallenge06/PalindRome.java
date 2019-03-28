package openchallenge06;

public class PalindRome {
	public static void main(String[] args) {
		
		int maxPalindRome = 0;
		
		
		for(int i =100; i<1000 ; i++) {
			for(int k=100; k<1000 ; k ++) {
				StringBuilder oldStr = new StringBuilder(Integer.toString(i*k));
				StringBuilder newStr = new StringBuilder(Integer.toString(i*k));
				newStr.reverse();
				if (newStr.toString().equals(oldStr.toString())) {
					System.out.println("대칭수를 찾았습니다. : " + i*k);
					if(maxPalindRome < i*k) maxPalindRome = i*k;
				}
			}
		}
		
		System.out.println("가장 큰 대칭수는 " + maxPalindRome + "입니다.");
		
		
	}

}
