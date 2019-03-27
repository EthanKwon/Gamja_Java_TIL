package openchallenge02;

import java.util.Scanner;

public class InsertExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AddString addStr = new AddString();
		
		System.out.print("숫자를 입력해 주세요. > ");
		String num = scan.nextLine();
		
		addStr.setAddString(addStr.dashInsert(num));
		
		System.out.println(addStr.toString());
		scan.close();
		
	}
}
