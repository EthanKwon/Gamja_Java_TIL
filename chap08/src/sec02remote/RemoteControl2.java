package sec02remote;

public class RemoteControl2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("소리를 켭니다.");
			}
			public void turnOff() {
				System.out.println("소리를 끕니다.");
			}
			
			public void setVolume(int volume) {
				System.out.println("소리를 조정");
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(true);
	}
}
