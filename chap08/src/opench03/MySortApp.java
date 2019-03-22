package opench03;

import java.util.Scanner;


public class MySortApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MySortImpl mySortImpl = new MySortImpl();
		String[] strArray = new String[5];
		boolean descOrder = true;
		
		System.out.println("-----------------------------");
		System.out.println("문자열을 입력해 주세요");
		System.out.println("-----------------------------");
		for(int i =0 ; i < strArray.length; i++) {
			System.out.print("문자열 > ");
			strArray[i] = scan.nextLine();
		}
		
		System.out.println("--------");
		System.out.println("오름차순");
		System.out.println("--------");
		mySortImpl.toString(mySortImpl.sort(strArray));
		System.out.println("--------");
		System.out.println("내림차순");
		System.out.println("--------");
		mySortImpl.toString(mySortImpl.sort(strArray,descOrder));
		;
			
		scan.close();
	}


}
