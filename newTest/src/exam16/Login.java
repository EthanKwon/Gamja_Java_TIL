package exam16;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		
		MemberDAO mDao = new MemberDAO();
		Scanner scan = new Scanner(System.in);
		
		//로그인 -> 아이디 : 1000 , 비밀번호 : *
		//MySQL에 있는 데이터베이스 이름이 info_member로 지정되어있어 이에 맞게 수정하였습니다.
		loginFunction(mDao,scan);
	
	}
	
	
	static void loginFunction(MemberDAO mDao, Scanner scan) {
		
		while(true) {
			System.out.println("[로그인]");
			System.out.print("ID > ");
			int userId = Integer.parseInt(scan.nextLine());
			System.out.print("Password > ");
			String userPass = scan.nextLine();
			if(mDao.IsMember(userId, userPass)) {
				System.out.println("로그인이 되었습니다.");
				break;
			} else {
				System.out.println("틀렸습니다. 다시 입력해 주세요.");
			}
		}
	}

}
