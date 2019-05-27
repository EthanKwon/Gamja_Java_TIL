package dartgame;

import java.util.regex.Pattern;

public class test {
	public static void main(String[] args) {
		String str = "3D4D5D";
		String strNum = "\\d";
		String strChar = "[SDT]";
		String strStar = "['*'#]"; 
		String[] throwDartList = new String[3];
		
		for(int i =0; i<throwDartList.length-1;i++) {
			String strExam = str.substring(3, 4);
			System.out.println(strExam);
			if(Pattern.matches(strChar, strExam)) {
				throwDartList[i] = str.substring(0, 2);
				str = str.substring(2);
				System.out.println(str);

			} else if(Pattern.matches(strNum, strExam)) {
				throwDartList[i] = str.substring(0, 3);
				str = str.substring(3);
				System.out.println(str);

			} else if(Pattern.matches(strStar, strExam)) {
				throwDartList[i] = str.substring(0, 4);
				str = str.substring(4);
				System.out.println(str);

			}
		}
		throwDartList[2] = str;
		
		System.out.println(throwDartList[0] + ", " +throwDartList[1] + ", "+ throwDartList[2] );
	}

}
