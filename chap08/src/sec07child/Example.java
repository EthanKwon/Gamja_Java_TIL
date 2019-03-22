package sec07child;

public class Example {
	public static void main(String[] args) {
		//Child1의 method2()는 default이므로 Child1 인터페이스에서 정의 되지 않아도 된다. 
		//이 때, method2()를 사용하게 되면 Parent의 method2()를 사용한다.
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {System.out.println("Child1의 method1()");};
			
			@Override
			public void method3() {System.out.println("Child1의 method3()");};
		};
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		
		//Child2의 method2()는 Child2 인터페이스에서 Override를 통해 재정의를 내렸다.  
		//이 때, method2()를 사용하게 되면 재정의한 Child2의 method2()를 사용한다.
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {System.out.println("Child2의 method1()");};
			
			@Override
			public void method3() {System.out.println("Child2의 method3()");};
		};
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		//Child3의 method2()는 Child2 인터페이스에서 abstract를 통해 추상메소드 선언을 했다.  
		//이 때, method2()를 사용하려면 이곳에서 재정의하여 Child3의 method2()를 사용한다.
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {System.out.println("Child3의 method1()");};
			
			@Override
			public void method2() {System.out.println("**Child3의 method2()**");};
			
			@Override
			public void method3() {System.out.println("Child3의 method3()");};
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();
	}
}
