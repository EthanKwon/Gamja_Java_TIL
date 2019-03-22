package opench01;

import java.util.Scanner;

public class MyCalcApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyCalc myCalc = new MyCalc();
		boolean run = true;
		
		System.out.println("-----------------------------");
		System.out.println("두 개의 정수를 입력해 주세요.");
		System.out.println("-----------------------------");
		System.out.print(" a > ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print(" b > ");
		int b = Integer.parseInt(scan.nextLine());
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("원하는 연산을 선택해 주세요.");
			System.out.println("");
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4.종료");
			System.out.println("선택된 숫자 : a= " + a + ", b= " + b);
			System.out.println("-----------------------------");
			System.out.print("> ");
			int selectNum;
			
			try {
				selectNum = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
				continue;
			}
			
			
			switch(selectNum) {
			case 1 : System.out.println("덧셈의 결과 : " + myCalc.add(a, b));
					 break;
			case 2 : System.out.println("뺄셈의 결과 : " + myCalc.subtract(a, b));
			 		 break;
			case 3 : System.out.println("곱셈의 결과 : " + myCalc.multiply(a, b));
			 		 break;
			case 4 : run = false;
			 		 break;
			default : System.out.println("올바른 입력이 아닙니다.");
					  break;
			}
		}
		System.out.println("연산을 종료합니다.");
		scan.close();
	}

}
