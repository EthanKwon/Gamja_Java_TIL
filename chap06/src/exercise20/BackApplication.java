package exercise20;

import java.util.Scanner;

public class BackApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner =new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println(" ------------------------------------------------------ ");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println(" ------------------------------------------------------ ");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo ==2) {
				accountList();
			} else if(selectNo ==3) {
				deposit();
			} else if(selectNo ==4) {
				withdraw();
			} else if(selectNo ==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		for(int i =0 ; i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				System.out.println();
				System.out.print("계좌 번호 : ");
				String ano = scanner.nextLine();
				System.out.print("계좌주 : ");
				String owner = scanner.nextLine();
				System.out.print("초기입금액 : ");
				int balance = Integer.parseInt(scanner.nextLine());
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록 보기
	
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(int i =0;i<accountArray.length;i++) {
			if(accountArray[i] == null) return;
			System.out.println(accountArray[i].toString());
		}
	}
	
	//예금하기
	
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("예금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	//출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("예금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		for(Account account: accountArray) {
			if(account == null)
				break;
			if(ano.equals(account.getAno())) {
				return account;
			}
		}
		return null;
	}
}
