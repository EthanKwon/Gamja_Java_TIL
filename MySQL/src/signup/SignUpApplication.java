package signup;

import java.util.List;
import java.util.Scanner;

public class SignUpApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDAO mDao = new MemberDAO();
		boolean condition = true;
		
		while (condition) {
			System.out.println("-----------");
			System.out.println(" 회원 메뉴 ");
			System.out.println("-----------");
			System.out.println(" 1. 가입 \n 2. 조회 \n 3. 변경 \n 4. 삭제 \n 5. 검색");
			System.out.println("종료를 원하시면 '0'을 입력해 주세요");
			System.out.print(" 입력 > ");
			int selectOption = Integer.parseInt(scan.nextLine());
			switch (selectOption) {

			case 1:
				signUp(mDao,scan);
				break;
			case 2:
				lookUpMember(mDao);
				break;
			case 3:
				updateMember(mDao,scan);
				break;
			case 4:
				deleteMember(mDao,scan);
				break;
			case 5:
				memberLookUp(mDao,scan);
				break;
			case 0:
				condition = false;
				break;
			}
		}
		scan.close();
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	static void signUp(MemberDAO mDao, Scanner scan) {
		MemberDTO member = new MemberDTO();
		System.out.print("패스워드 > ");
		member.setPassword(scan.nextLine());
		System.out.print("이름 > ");
		member.setName(scan.nextLine());
		System.out.print("생년월일 > ");
		member.setBirthday(scan.nextLine());
		System.out.print("주소 > ");
		member.setAddress(scan.nextLine());
		try {
			mDao.insertMember(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("축하합니다. 가입이 완료되었습니다.");
	}
	
	static void lookUpMember(MemberDAO mDao) {
		List<MemberDTO> memberList = mDao.selectAlldesc();
		System.out.println("[가입한 사람 명단]");
		for(MemberDTO member : memberList) {
			System.out.println(member.toString());
		}
		System.out.println();
	}
	
	static void updateMember(MemberDAO mDao,Scanner scan) {
		
		MemberDTO member = new MemberDTO();
		
		System.out.println("변경을 위해 ID와 Passward를 입력해 주세요.");
		System.out.print("ID > ");
		int userId = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드 > ");
		String userPassword = scan.nextLine();
		
		if(mDao.IsMember(userId,userPassword)) {
			System.out.println("인증 완료!");
			member.setId(userId);
			System.out.print("패스워드 > ");
			member.setPassword(scan.nextLine());
			System.out.print("이름 > ");
			member.setName(scan.nextLine());
			System.out.print("생년월일 > ");
			member.setBirthday(scan.nextLine());
			System.out.print("주소 > ");
			member.setAddress(scan.nextLine());

			mDao.updateMember(member);
			
			System.out.println("변경이 완료 되었습니다. 아래 정보를 다시한번 확인해 주세요.\n");
			System.out.println(mDao.selectOne(member.getId()).toString());
		}
		else
			System.out.println("틀렸습니다. 메뉴 화면으로 돌아 갑니다.");
	}
	
	static void deleteMember(MemberDAO mDao,Scanner scan) {
		
		System.out.print("삭제하고자 하는 ID > ");
		int delNum  = Integer.parseInt(scan.nextLine());
		
		mDao.deleteMember(delNum);
		System.out.println("삭제가 완료 되었습니다. 아래 정보를 다시한번 확인해 주세요.\n");
		List<MemberDTO> memberList = mDao.selectAll();
		for(MemberDTO member : memberList) {
			System.out.println(member.toString());
		}
	}

	static void memberLookUp(MemberDAO mDao,Scanner scan) {
		
		System.out.print("검색하고자 하는 이름 > ");
		String name  = scan.nextLine();
		
		if(mDao.searchMember(name)) {
			System.out.println("찾았습니다. 아래 정보를 다시한번 확인해 주세요.\n");
			List<MemberDTO> memberList = mDao.selectIdLookUp(name);
			System.out.println("[검색된 사람 명단]");
			for(MemberDTO member : memberList) {
				System.out.println(member.toString());
			}
			System.out.println();
		}
		else
			System.out.println("존재하지 않는 이름 입니다.");
	}
	
}
