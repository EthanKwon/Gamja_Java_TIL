package exam17;

import java.util.Scanner;

public class EaglesApplication {
	public static void main(String[] args) {
		
		EaglesDAO eDao = new EaglesDAO();
		
		//데이터 베이스에 맞게 아래와 같이 정보를 주었습니다.
		//데이터베이스 구성 : 등번호, 이름, 포지션, 출신학교, 던지는손, 치는손, 생년월일, 연봉
		EaglesDTO eDto1 = new EaglesDTO(99,"정민철","투수","대전고","우투","우타","1999-04-03",27000000);
		EaglesDTO eDto2 = new EaglesDTO(98,"박재홍","외야수","인천고","우투","좌타","1995-03-25",30000000);
		
		Scanner scan = new Scanner(System.in);
		boolean condition = true;
		
		while (condition) {
			System.out.println("[육성 선수 관리]");
			System.out.println("아래의 서비스를 이용할 수 있습니다.");
			System.out.println("|1. 선수 등록| |2. 선수 트레이드 | |3. 종료 |");
			System.out.print("선택 > ");
			int selectMenu = Integer.parseInt(scan.nextLine());
			switch (selectMenu) {

			case 1: addMember(eDto1, eDao);
					break;
			case 2: updateMember(eDto2,eDao);
					break;
			case 3: condition= false;
					break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.\n");
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
		scan.close();
	}
	
	static void addMember(EaglesDTO eDto, EaglesDAO eDao){
		
		eDao.insertMember(eDto); //내용 삽입
		
		System.out.println("육성 선수중 한명을 1군 선수로 등록하였다.");
		System.out.println(eDao.selectOne(eDto.getBack_no()).toString());
	}
	
static void updateMember(EaglesDTO eDto, EaglesDAO eDao){
		
		eDao.updateMember(eDto,99); //내용 삽입
		
		System.out.println("이 육성선수를 다음 선수로 트레이드 하였다.");
		System.out.println(eDao.selectOne(eDto.getBack_no()).toString());
	}

}
