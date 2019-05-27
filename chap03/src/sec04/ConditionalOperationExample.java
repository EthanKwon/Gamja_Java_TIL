package sec04;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 45;
		char grade = (score > 90) ? 'A' : ( (score >80) ? 'B' : ((score>70)?'C':((score>60)? 'D' : ((score > 50)? 'E' : 'F'))));
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
