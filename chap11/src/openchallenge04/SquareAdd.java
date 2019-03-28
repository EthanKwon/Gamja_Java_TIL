package openchallenge04;

import java.util.Scanner;

public class SquareAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요. > ");
		
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println("합의 제곱과 제곱의 합의 차이는 " + Square_Add(n)+ "입니다.");
		
		scan.close();
	}
	
	public static int Square_Add(int n) {
		int squareAdd = 0;
		int addSquare = 0;
		int num =0;
		
		for(int i=1; i<=n;i++) {
			squareAdd += i*i;
			num += i;
		}
		
		addSquare = num * num;
		
		return (addSquare-squareAdd);
		
	}
	

}
