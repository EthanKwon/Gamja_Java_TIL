package sec03smart;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOn();
		
		rc.setVolume(56);
		rc.setVolume(500);
	}

}
