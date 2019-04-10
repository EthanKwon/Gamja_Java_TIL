package sec03_HashSet;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String strArray[] = {"김","이","박","한","정"};
		//Arrays.sort(strArray);
		
		System.out.println(Arrays.toString(strArray));
		
		for(int i=0;i<strArray.length-1 ;i++) {
			for(int k=i+1;k<strArray.length;k++ ) {
				if(strArray[i].compareTo(strArray[k]) > 0) {
					String temp = strArray[i];
					strArray[i] = strArray[k];
					strArray[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(strArray));
	}
	
	

}
