package sec03smart;

public interface RemoteControl {
	//인터페이스에는 필드 값이 없다.
	//생성자도 없다.
	
	//상수값
	public static final int MAX_VOLUME = 10;
	public static final int MIN_NOLUME = 0;
	
	//추상메소드 : 중괄호가 없다 (만들어야 한다고 명시만 해주기 때문에)
	public void turnOn();
	public void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴드 메소드 : 
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 : static은 자바에서 메모리를 딱 한번만 할당한다 즉, 모든 객체가 할당된 메모리의 공유를 뜻한다. 
	public static void changeBattery() {
		System.out.println("건전지를 교환 합니다.");
	}

}
