package openchallenge02;

public class AddString {
	
	private String str;
	
	public void setAddString(String str) {
		this.str = str;
	}
	
	public String dashInsert(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length()-1; i++) {
			int num1 = Integer.parseInt(str.substring(i, i+1));
			int num2 = Integer.parseInt(str.substring(i+1, i+2));
			if((num1*num2)%2 != 0) { //홀수 홀수
				sb.append(num1);
				sb.append("-");
			} else if ((num1+num2)%2 == 0) { //짝수 짝수
				sb.append(num1);
				sb.append("*");
			} else {
				sb.append(num1);
			}
		}
		sb.append(str.substring(str.length()-1));
		return sb.toString();
	}

	@Override
	public String toString() {
		return "수정된 문자열 = " + str;
	}
	
	

}
