package openchallenge;

public class StudentScore {
	String name;
	int mat;
	int eng;
	int sci;
	double avg;
	
	public StudentScore(String name, int mat, int eng, int sci) {
		this.name = name;
		this.mat = mat;
		this.eng = eng;
		this.sci = sci;
	}
	
	double average() {
		avg = mat + eng + sci;
		avg /= 3.0;
		return avg;
	}
	
	
	@Override
	public String toString() {
		return "학생 점수 [이름 :" + name + ", 수학 점수 :" + mat + ", 영어 점수 :" + eng + ", 과학 점수 :" + sci + ", 평균 : " + avg + "]";
	}
}
