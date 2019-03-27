package openchallenge03;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요. > ");
		int num = Integer.parseInt(scan.nextLine());
		
		for(int i = 1; i<num ; i++) {
			int sum =0;
			for(int k = 1; k<i ; k++) {
				if(i%k == 0) {
					sum += k;
				}
			}
			if(i == sum) {
				System.out.println("완전수 [" + i + "] 를 찾았습니다.");
			}
		}
		scan.close();
	}

}
