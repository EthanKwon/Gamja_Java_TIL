package sec05car;

public class Car {
	public int speed;
	
	public void speedUp() { speed +=1;}
	
	public final void stop() {
		System.out.println("차가 멈춤");
		speed = 0;
	}

}
