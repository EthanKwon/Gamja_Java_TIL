package exercise16;

public class Printer {
	
	//오버로딩을 사용 (같은 함수를 다른 변수를 지정해서 자신이 원하는 것으로 골라서 사용)
	
	void println(int x) {
		System.out.println(x);
	}
	void println(boolean x) {
		System.out.println(x);
	}
	void println(double x) {
		System.out.println(x);
	}
	void println(String x) {
		System.out.println(x);
	}

}
