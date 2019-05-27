package exam12;

public class SumAndMean {
	public static void main(String[] args) {
		int[][] intArray = {{95,86,88},{88,92,96,85},{78,83,93,87,88}};
		int sum = 0;
		int mean = 0;
		int count = 0;
		for(int i = 0; i<intArray.length ;i++) {
			for(int k=0; k < intArray[i].length ; k++) {
				sum += intArray[i][k];
				count ++;
			}
		}
		mean = sum/count;
		System.out.println("배열 전체의 합 : " + sum);
		System.out.println("배열 전체의 평균 : " + mean);
	}

}
