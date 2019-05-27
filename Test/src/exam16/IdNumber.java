package exam16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IdNumber {
	public static void main(String[] args) {
		String Idn = getIdn();
		
		System.out.println(getInfo(Idn));
		
	}
	
	static String getIdn() {
		Scanner scan = new Scanner(System.in);
		String Idn;
		String pattern = "\\d{6}-[1-4]";
		while(true) {
			System.out.print("입력 : ");
			Idn = scan.nextLine();
			if(Pattern.matches(pattern,Idn)) {
				break;
			}
			System.out.println("다시 입력해 주세요.");
		}
		scan.close();
		return Idn;
	}
	
	static String getInfo(String Idn) {
		int year = Integer.parseInt(Idn.substring(0, 2));
		if (year < 20) {
			year += 2000;
		} else {
			year += 1900;
		}
		int month = Integer.parseInt(Idn.substring(2,4));
		int day = Integer.parseInt(Idn.substring(4, 6));
		char gender = Idn.charAt(Idn.length()-1);
		String strGender;
		if (gender == '1' | gender == '3' ) 
			strGender = "남자";
		else
			strGender = "여자";
		LocalDate personInfo = LocalDate.of(year, month, day);
		
		DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E), ");

		String strInfo = personInfo.format(dateTimeFormatter);
		strInfo += strGender;
		
		return strInfo;
		
	}

}
