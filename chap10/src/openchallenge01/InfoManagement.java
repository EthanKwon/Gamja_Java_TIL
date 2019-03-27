package openchallenge01;

import java.util.Scanner;

import exercise07.NotExistIDException;
import exercise07.WrongPasswordException;

public class InfoManagement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("아이디와 비밀번호를 입력해 주세요.");
		System.out.println("----------------------------------");
		System.out.print("아이디 > ");
		String inputId = scan.nextLine();
		System.out.print("비밀번호 > ");
		String inputPassword = scan.nextLine();
		
		try {
			login(inputId,inputPassword);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		String[] loginIds = new String[] {"abcde", "fghij", "klmno", "pqrst", "uvwxyz"};
		String[] passwords = new String[] {"abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12"};
		boolean returnLogin = false;
		boolean returnPassword = false;
		
		for(int i = 0; i<loginIds.length;i++) {
			if(id.equals(loginIds[i])){
				returnLogin = true;
				if(password.equals(passwords[i])) {
					returnPassword = true;
				}
				break;	
			}
		}
		if(!returnLogin) throw new NotExistIDException("존재하지 않는 아이디 입니다.");
		if(!returnPassword) 
			throw new WrongPasswordException("비밀번호가 틀렸습니다.");
		else
			System.out.println("로그인 성공");
		
	}
	
}
