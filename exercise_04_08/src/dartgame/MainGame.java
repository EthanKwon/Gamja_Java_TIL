package dartgame;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dart dart = new Dart();
		String dartScoreFormat = "[1]*\\d[SDT]['*'#]?[1]*\\d[SDT]['*'#]?[1]*\\d[SDT]['*'#]?";
		boolean IsRight;
		boolean run; 
		String dartScores = new String();
		
		
		System.out.println("다트 게임을 시작하시겠습니까? Y/N");
		System.out.print(" > ");
		String a = scan.nextLine();
		if (a.equals("Y")) run = true;
		else run = false;
		while(run) {
			System.out.print("맞힌 내역을 입력해 주세요. > ");
			String str = scan.nextLine();
			IsRight = Pattern.matches(dartScoreFormat, str);
			if(IsRight) dartScores = str;
			else System.out.println("입력 형태가 틀립니다.");	
			
			int totalScore = dart.calcScore(dartScores);
			
			System.out.println("---------------------------");
			System.out.println("|      다트 게임 결과     |");
			System.out.println("---------------------------");
			System.out.println("맞춘 곳 : " + str);
			System.out.println("점수 계산 : ");
			System.out.println("총점 : "+ totalScore);
			
			System.out.println("게임을 한번 더 하시겠습니까? Y/N");
			System.out.print(" > ");
			a = scan.nextLine();
			if (a.equals("Y")) run = true;
			else run = false;
		}
		scan.close();
		System.out.println("다트 게임이 종료 되었습니다.");
	}

}
