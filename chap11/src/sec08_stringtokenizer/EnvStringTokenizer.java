package sec08_stringtokenizer;

import java.util.StringTokenizer;

public class EnvStringTokenizer {
	public static void main(String[] args) {
		
		String envMyPath = System.getenv("Path");
		StringTokenizer myPathList = new StringTokenizer(envMyPath, ";");
		int countTokens = myPathList.countTokens();
		for(int i=0;i<countTokens;i++) {
			String token = myPathList.nextToken();
			System.out.println(token);
		}
	}

}
