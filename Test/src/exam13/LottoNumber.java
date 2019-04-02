package exam13;

import java.util.Arrays;

public class LottoNumber {
	public static void main(String[] args) {
		int [] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));
	}
	
	static int[] getLottoNumber() {
		int[] randomArrays = new int[6];
		for(int i=0;i<randomArrays.length;i++) {
			randomArrays[i] = (int)(Math.random()*45)+1;
		}
		return randomArrays;
	}
	

}
