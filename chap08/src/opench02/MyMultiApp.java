package opench02;

import java.util.Scanner;


public class MyMultiApp {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyMultiImpl myMultiImpl = new MyMultiImpl();
		boolean run = true;
		int[] arr = {1,10,3,4,50,6,70,8,9,4};
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("원하는 연산을 선택해 주세요.");
			System.out.println("");
			System.out.println("1. 최대값 | 2. 최솟값 | 3. 합계 | 4.평균 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("> ");
			int selectNum;
			
			try {
				selectNum = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
				continue;
			}
			
			
			switch(selectNum) {
			case 1 : System.out.println("최대값 : " + myMultiImpl.max(arr));
					 break;
			case 2 : System.out.println("최솟값 : " + myMultiImpl.min(arr));
			 		 break;
			case 3 : System.out.println("합계 : " + myMultiImpl.sum(arr));
			 		 break;
			case 4 : System.out.println("평균 : " + myMultiImpl.avg(arr));
					 break;
			case 5 : run = false;
			 		 break;
			default : System.out.println("올바른 입력이 아닙니다.");
					  break;
			}
		}
		System.out.println("연산을 종료합니다.");
		scan.close();
	}


}
