package sec05casting;
import sec05driver.Vehicle;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		Vehicle vehicleOrigin;
		
		
		vehicle.run();
//		vehicle.checkFare(); 오류
		
		Bus bus = (Bus) vehicle; //자식 클래스로 자동 변환 일 이루어 졌던 적이 있었을 때만 가능
//		Bus bus1 = (Bus) vehicleOrigin; 오류
		
		bus.run();
		bus.checkFare();
		
		
	}

}
