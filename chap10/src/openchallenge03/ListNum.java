package openchallenge03;

import java.util.Scanner;

public class ListNum {
	public static void main(String[] args) {
		String[] numList = new String[10];
		int countList = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("숫자를 입력해 주세요 (최대 10개)");
		System.out.println("--------------------------------");
		for(int i = 0; i<numList.length;i++) {
			System.out.print("입력 > ");
			numList[i] = scan.nextLine();
			if(numList[i].equals("")) {
				countList = i;
				System.out.println("입력을 종료합니다.");
				break;
			}
			try {
				int a =Integer.parseInt(numList[i]);
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
				System.out.println("입력을 종료합니다.");
				countList = i;
				break;
			}
		}
		System.out.println("-----------");
		System.out.println("입력된 숫자");
		System.out.println("-----------");
		
		for(int i =0; i <countList;i++) {
			System.out.println((i+1) + "번째 숫자 : " + numList[i]);
		}
		
		boolean numEqual = true;
		
		System.out.println("");
		
		System.out.println("-----------------------------");
		System.out.println("새로운 숫자인가? (true/false)");
		System.out.println("-----------------------------");
		
		for(int i=0;i <countList ; i ++) {
			for(int k=0;k<i ; k ++ ) {
				if(numList[i].equals(numList[k])) {
					numEqual = false;
					break;
				}
				numEqual = true;
			}
			System.out.println((i+1) + "번째 숫자 : " + numEqual);
		}
		
		scan.close();
	}
	
	

}
