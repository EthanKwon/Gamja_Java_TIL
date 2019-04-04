package signin;

import java.util.Scanner;
import signup.*;

public class SignInApplication {
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		BbsDAO bDao = new BbsDAO();
		BbsDTO bDto = new BbsDTO();
		Scanner scan = new Scanner(System.in);
		boolean condition = true;
		
		loginFunction(mDao,bDao,scan,bDto);
		
		while (condition) {
			System.out.println("[회원 메뉴]");
			System.out.println("아래의 서비스를 이용할 수 있습니다.");
			System.out.println("|1. 쓰기| |2. 조회 | |3. 변경| |4. 삭제| |5. 상세조회| |6. 종료|");
			System.out.print("선택 > ");
			int selectMenu = Integer.parseInt(scan.nextLine());
			switch (selectMenu) {

			case 1: addContent(bDao, bDto, scan);
					break;
			case 2: lookUpContent(bDao);
					break;
			case 3: changeContent(mDao, bDao, bDto, scan);
					break;
			case 4: deleteContent(mDao, bDao, bDto, scan);
					break;
			case 5: detailContent(mDao, bDao, bDto, scan);
					break;
			case 6: condition= false;
					break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.\n");
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
	}
	//로그인 함수
	static void loginFunction(MemberDAO mDao,BbsDAO bDao, Scanner scan, BbsDTO bDto) {
		
		while(true) {
			System.out.println("[로그인]");
			System.out.print("ID > ");
			int userId = Integer.parseInt(scan.nextLine());
			System.out.print("Password > ");
			String userPass = scan.nextLine();
			if(mDao.IsMember(userId, userPass)) {
				System.out.println("로그인이 되었습니다.");
				bDto.setMemberId(userId);
				break;
			} else {
				System.out.println("틀렸습니다. 다시 입력해 주세요.");
			}
		}
	}
	
	//내용 추가 함수
	static void addContent(BbsDAO bDao,BbsDTO bDto, Scanner scan){
		System.out.print("제목 > ");
		bDto.setTitle(scan.nextLine());
		System.out.print("내용 > ");
		bDto.setContent(scan.nextLine());
		
		bDao.insertBbs(bDto); //내용 삽입
		
		System.out.println("내용이 삽입되었습니다. 아래 결과를 확인해 주세요.");
		
		System.out.println(bDao.selectOne(bDto.getMemberId()).toString());
	}

	//내용 조회 함수
	static void lookUpContent(BbsDAO bDao) {
		System.out.println("[게시판 List]");
		for(BbsDTO write : bDao.selectNameAlldesc()) {
			System.out.println(write.toStringName());
		}
		System.out.println();
	}

	//내용 변경 함수
	static void changeContent(MemberDAO mDao, BbsDAO bDao, BbsDTO bDto, Scanner scan) {
		System.out.println("작성자의 이름을 입력해주세요.");
		System.out.print("입력 > ");
		String name = scan.nextLine();
		System.out.println("변경하고자하는 게시물의 id를 입력해주세요.");
		System.out.println("[작성자 List]");
		for(BbsDTO write : bDao.selectNameAllWriter(name)) {
			System.out.println(write.toStringName());
		}
		System.out.print("입력 > ");
		bDto.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("비밀번호 > ");
		String conPass = scan.nextLine();
		
		if(mDao.IsMember(bDto.getMemberId(), conPass)) {
			System.out.print("변경할 제목 > ");
			bDto.setTitle(scan.nextLine());
			System.out.print("변경할 내용 > ");
			bDto.setContent(scan.nextLine());
			bDao.updateBbs(bDto);	
			System.out.println("변경이 완료되었습니다. 아래 내용을 확인해 주세요.\n");
			System.out.println("[작성자 List]");
			for(BbsDTO write : bDao.selectContentAllWriter(name)) {
				System.out.println(write.toStringContent());
			}
		} else {
		 System.out.println("틀렸습니다. 처음 메뉴로 돌아갑니다.");
		}
	}
	
	//내용 삭제 함수
	static void deleteContent(MemberDAO mDao, BbsDAO bDao, BbsDTO bDto, Scanner scan) {
		System.out.println("삭제하고자하는 게시물의 id를 입력해주세요.");
		System.out.println("[작성자 List]");
		for(BbsDTO write : bDao.selectNameAlldesc()) {
			System.out.println(write.toStringName());
		}
		System.out.print("입력 > ");
		bDto.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("비밀번호 > ");
		String conPass = scan.nextLine();
		
		if(mDao.IsMember(bDto.getMemberId(), conPass)) {
			bDao.deleteBbs(bDto);
			System.out.println("삭제가 완료되었습니다. 아래 내용을 확인해 주세요.\n");
			System.out.println("[작성자 List]");
			for(BbsDTO write : bDao.selectNameAlldesc()) {
				System.out.println(write.toStringName());
			}
		} else {
		 System.out.println("틀렸습니다. 처음 메뉴로 돌아갑니다.");
		}
	}
	
	//내용 상세보기 함수
	static void detailContent(MemberDAO mDao, BbsDAO bDao, BbsDTO bDto, Scanner scan) {
		System.out.println("상세보기를 원하는 게시물을 입력해 주세요.");
		lookUpContent(bDao);
		System.out.print("입력 > ");
		bDto.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("[내용 상세 보기]");
		for(BbsDTO write : bDao.selectContentId(bDto.getId())) {
			System.out.println(write.toStringContent());
		}
		
	}
}
