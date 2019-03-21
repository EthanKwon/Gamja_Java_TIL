package opench02;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("고객 정보를 입력해 주세요.");
		System.out.println("--------------------------");
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("전화번호 : ");
		String phoneNum = scanner.nextLine();
		System.out.print("주소 : ");
		String address = scanner.nextLine();
		System.out.print("고객 번호 : ");
		int csNum = Integer.parseInt(scanner.nextLine());
		System.out.print("마일리지 : ");
		int mileage = Integer.parseInt(scanner.nextLine());
		System.out.println("");
		
		Member member = new Member(name, phoneNum, address, csNum, mileage);
		
		member.show();
		System.out.println("이상 입니다.");
		
		
		
		
	}

}
