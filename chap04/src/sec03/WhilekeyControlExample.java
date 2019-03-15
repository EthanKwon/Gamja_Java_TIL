package sec03;

public class WhilekeyControlExample {
	public static void main(String[] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------------------------------");
				System.out.println("1. 가속 | 2. 감속 | 3. 급가속 | 4. 급감속 | 5. 중지");
				System.out.println("---------------------------------------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) {
				speed ++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) {
				speed--;
				if (speed < 0) {
					speed = 0;
					System.out.println("더이상 속도를 줄일수 없습니다.");
				} else System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) {
				speed += 10;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 52) {
				speed -= 10;
				if (speed < 0) {
					speed = 0;
					System.out.println("더이상 속도를 줄일수 없습니다.");
				} else System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 53) {
				run = false;
			}
		}
		 
		
		System.out.println("프로그램 종료");
	}

}
