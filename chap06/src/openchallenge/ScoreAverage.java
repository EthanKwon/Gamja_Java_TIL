package openchallenge;

import java.util.Scanner;

public class ScoreAverage {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		int mat;
		int eng;
		int sci;

		while(true) {
			System.out.print("이름을 입력하세요 > ");
			name = scan.nextLine();
			boolean check = isInteger(name);
			if (!check) break;
			System.out.println("이름을 다시 입력하세요.");
		}
		
		while(true) {
			System.out.print("수학 점수를 입력하세요 > ");
			try {
				mat = Integer.parseInt(scan.nextLine());
				 break;
			} catch (NumberFormatException e) {
				System.out.println("수학 점수를 다시 입력하세요.");
				continue;
			}
		}
		
		while(true) {
			System.out.print("영어 점수를 입력하세요 > ");
			try {
				eng = Integer.parseInt(scan.nextLine());
				 break;
			} catch (NumberFormatException e) {
				System.out.println("영어 점수를 다시 입력하세요.");
				continue;
			}
		}
		
		while(true) {
			System.out.print("과학 점수를 입력하세요 > ");
			try {
				 sci = Integer.parseInt(scan.nextLine());
				 break;
			} catch (NumberFormatException e) {
				System.out.println("과학 점수를 다시 입력하세요.");
				continue;
			}
		}
		
		StudentScore student = new StudentScore(name, mat, eng, sci);
		
		student.avg = student.average();
		System.out.println(student.toString());
		scan.close();
		

	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}
