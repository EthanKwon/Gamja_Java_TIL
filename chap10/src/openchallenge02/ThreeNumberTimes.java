package openchallenge02;

public class ThreeNumberTimes {
	private String[][] str = new String[24][60];
	int sum =0;
	
	public int ThreeNumTimes() {
		for(int i=0;i<str.length;i++) {
			for(int k=0;k<str[i].length;k++) {
				str[i][k] = Integer.toString(i*100 + k);
				if(str[i][k].contains("3")) {
					int temp = Integer.parseInt(str[i][k]);
					int hour = temp/100;
					int min = temp%100;
					sum += 60;
				}			
			}
		}
		return sum;
	}

}
