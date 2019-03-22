package sec05driver;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		driver.run(); 오류 발생!
		
		driver.drive(bus); //자동적으로 타입을 변환
		driver.drive(taxi); //자동적으로 타입을 변환
		
		
	}

}
