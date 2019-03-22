package sec03smart;

import sec02remote.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_NOLUME) {
			this.volume = RemoteControl.MIN_NOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	
	

}
