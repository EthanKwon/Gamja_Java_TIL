package exercise07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}

//Tire의 값을 자식 클래스로 받아 snowTire의 run() method가 실행