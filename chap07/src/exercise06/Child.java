package exercise06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		//부모 생성자를 선언 하지 않으면 자동으로 super()를 선언 한다.
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
