package sec05_Function;

public class Student {
	private String name;
	private int EnglishScore;
	private int MathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		EnglishScore = englishScore;
		MathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return EnglishScore;
	}

	public int getMathScore() {
		return MathScore;
	}
	
	
	

}
