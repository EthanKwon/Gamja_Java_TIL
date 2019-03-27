package exercise09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1;i<=100;i++) {
			str += i;
		}
		System.out.println(str);
		
		StringBuilder newStr = new StringBuilder();
		for(int i=1;i<=100;i++) {
			newStr.append(i);
		}
		System.out.println(newStr);
	}

}
