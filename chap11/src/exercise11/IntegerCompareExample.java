package exercise11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		//포장 객체는 내부의 값을 비교하기 위해 "=="연산자와 "=!"연산자를 사용할 수 없다. 
		//이 연산자는 내부의 값을 비교하는게 아니라 포장 객체의 참조를 비교하기 때문이다.
		//그래서, 내부의 값을 비교하려면 언박싱한 값을 얻어 비교해야 한다.
		//다만, 자바 규칙에 따르면 Integer는 박싱된 값이 -128~127사이의 값을 가지면 비교가 가능 하다.
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		
	}

}
