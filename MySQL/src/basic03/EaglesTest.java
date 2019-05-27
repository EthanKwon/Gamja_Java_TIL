package basic03;

import java.util.List;

public class EaglesTest {
	public static void main(String[] args) {
		EaglesDAO eagles = new EaglesDAO();
//		EaglesDTO player = eagles.selectOne(34);
		
//		eagles.deleteEagles(34);
		
		/*List<EaglesDTO> playerList = eagles.selectAll();
		
		for(EaglesDTO players : playerList) {
			System.out.println(players.toString());
		}*/
		
		List<EaglesDTO> playerList = eagles.selectPlayersBySalary(300000);
		
		System.out.println("[연봉 3억 이상의 선수 명단]");
		for(EaglesDTO players : playerList) {
			System.out.println(players.toString());
		}
		
		System.out.println("");
		
		String positions[] = {"투수","포수","내야수","외야수"};
		for(String position : positions) {
			playerList = eagles.selectPlayersByPosition(position);
			System.out.println("["+ position +"포지션을 가진 선수 명단]");
			for(EaglesDTO players : playerList) {
				System.out.println(players.toString());
			}
			System.out.println("");
		}
		
		int salarys[] = {200000, 300000, 500000, 700000, 1000000};
		for(int salary : salarys) {
			playerList = eagles.selectPlayersBySalary(salary);
			System.out.println("["+ salary +"이상의 연봉을 가진 선수 명단]");
			for(EaglesDTO players : playerList) {
				System.out.println(players.toString());
			}
			System.out.println("");
		}
		
		//eagles.insertEagles(new EaglesDTO(34, "김민하", "외야수", "경남고", "우투", "우타","1989년 2월 25일", 300000 ));
		
		/*player = eagles.selectOne(5);
		System.out.println(player.toString());
		
		eagles.updateEagles(new EaglesDTO(5, "김민기","내야수","덕수고","우투","우타","1999년 6월 12일",100000));
		
		player = eagles.selectOne(5);
		System.out.println(player.toString());*/
		
		
		
		eagles.close();
		
	}

}
