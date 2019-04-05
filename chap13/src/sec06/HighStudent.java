package sec06;

public class HighStudent extends Student {
	private String highStudent;
	
	public HighStudent(String highStudent) {
		super(highStudent);
		this.highStudent = highStudent;
	}
	public String toString() {return highStudent;}

}
