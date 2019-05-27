package sec08Calc2;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
	double result1 = myCalcu.areaRectangle(10);
	
	double result2 = myCalcu.areaRectangle(10,20);
	
	System.out.println("정사각형 넚이 : " + result1);
	System.out.println("직사각형 넚이 : " + result2);
	}

}
