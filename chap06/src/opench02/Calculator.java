package opench02;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------");
		System.out.println("숫자 입력");
		System.out.println("---------");
		System.out.print("첫번째 > ");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 > ");
		int b = Integer.parseInt(scanner.nextLine());
	
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("원하는 연산 : 1. 덧셈 | 2. 뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("골라주세요 > ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1 :	Add add = new Add();
						add.setValue(a, b);
						System.out.println("결과 : " + add.calculate());
						break;
			case 2 :	Sub sub = new Sub();
						sub.setValue(a, b);
						System.out.println("결과 : " + sub.calculate());
						break;
			case 3 :	Mul mul = new Mul();
						mul.setValue(a, b);
						System.out.println("결과 : " + mul.calculate());
						break;
			case 4 :	Div div = new Div();
						div.setValue(a, b);
						System.out.println("결과 : " + div.calculate());
						break;
			case 5 :	run = false;
						break;
			default : 	System.out.println("올바르지 않은 입력입니다.");
			}
		}
		System.out.println("시스템을 종료합니다.");
		scanner.close();
	}

}
