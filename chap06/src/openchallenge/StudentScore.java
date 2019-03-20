package openchallenge;

public class StudentScore {
	private String name;
	private int mat;
	private int eng;
	private int sci;
	double avg;
	
	public StudentScore(String name, int mat, int eng, int sci) {
		this.name = name;
		this.mat = mat;
		this.eng = eng;
		this.sci = sci;
	}
	
	double average() {
		double avg =this.mat + this.eng + this.sci;
		avg /= 3.0;
		return avg;
	}
	
	
	@Override
	public String toString() {
		return "학생 점수 [이름 :" + this.name + ", 수학 점수 :" + this.mat + ", 영어 점수 :" + this.eng + ", 과학 점수 :" + this.sci + ", 평균 : " + this.avg + "]";
	}
}
