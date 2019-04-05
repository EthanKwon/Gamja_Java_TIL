package sec06;

public class Student extends Person {
	private String student;

	public Student(String student) {
		super(student);
		this.student = student;
	}
	public String toString() {return student;}

}
