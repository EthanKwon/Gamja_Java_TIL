package exercise05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		//this.name = name; // 기본 생성자가 없기 때문에
		super(name);
		this.studentNo = studentNo;
	}
}
