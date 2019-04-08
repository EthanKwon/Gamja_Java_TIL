package dartgame;

import java.util.regex.Pattern;

public class Dart {
	private String[] throwDartList = new String[3];
	private double[] throwDartScoreList = new double[3];
	
	public Dart() {}
	
	public double[] getThrowDartScoreList() {
		return throwDartScoreList;
	}
	
	public int calcScore(String str) {
		int sum = 0;
		String strNum = "\\d";
		String strChar = "[SDT]";
		String strStar = "['*'#]"; 
		
		for(int i =0; i<throwDartList.length-1;i++) {
			throwDartList[i] = str.substring(3, 4);
			
			if(Pattern.matches(strChar, throwDartList[i])) {
				throwDartList[i] = str.substring(0, 2);
				str = str.substring(2);
			} else if(Pattern.matches(strNum, throwDartList[i])) {
				throwDartList[i] = str.substring(0, 3);
				str = str.substring(3);
			} else if(Pattern.matches(strStar, throwDartList[i])) {
				throwDartList[i] = str.substring(0, 4);
				str = str.substring(4);
			}
		}
		throwDartList[2] = str;
		
		for(int i =0; i<throwDartScoreList.length;i++) {
			if(throwDartList[i].indexOf("10") != -1)
				throwDartScoreList[i] = Integer.parseInt(throwDartList[i].substring(0,2));
			else throwDartScoreList[i] = Integer.parseInt(throwDartList[i].substring(0,1));
		}
		
		for(int i =0 ; i<throwDartList.length;i++) {
			if(throwDartList[i].indexOf("S") != -1)
				throwDartScoreList[i] = Math.pow(throwDartScoreList[i], 1.0);
			else if (throwDartList[i].indexOf("D") != -1)
				throwDartScoreList[i] = Math.pow(throwDartScoreList[i], 2.0);
			else if (throwDartList[i].indexOf("T") != -1)
				throwDartScoreList[i] = Math.pow(throwDartScoreList[i], 3.0);
		}
		
		for(int i =0 ; i<throwDartList.length;i++) {
			if(throwDartList[i].indexOf("*") != -1) {
				throwDartScoreList[i] *= 2;
				if(i-1 >= 0) throwDartScoreList[i-1] *= 2;
			}
			else if (throwDartList[i].indexOf("#") != -1)
				throwDartScoreList[i] *= -1;
		}
		
		for(double score : throwDartScoreList) {
			sum += score;
		}
		
		return sum ;
	}
}
