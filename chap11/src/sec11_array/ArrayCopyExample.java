package sec11_array;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//Array의 길이 만큼 카피
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString (arr2));
		
		//Array의 범위에서 하나씩 카피
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString (arr3));
		
		
		//Array의 길이를 하나씩 카피
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i = 0;i<arr4.length;i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}

}
