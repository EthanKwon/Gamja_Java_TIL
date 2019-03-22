package sec02remote;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc.setVolume(56);
		rc.setVolume(500);
	}

}
