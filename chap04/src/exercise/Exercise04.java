package exercise;

public class Exercise04 {
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			int Dice1 = (int)(Math.random()*6)+1;
			int Dice2 = (int)(Math.random()*6)+1;
			System.out.println("(" + Dice1 + "," + Dice2 + ")");
			if(Dice1 + Dice2 == 5) {
				run = false;
			}
		}
	}

}
