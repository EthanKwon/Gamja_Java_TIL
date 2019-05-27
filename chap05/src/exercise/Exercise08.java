package exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		double count = 0.0;
		int max = 0;
		int min = 100;
		double variance = 0.0;
		
		//배열 전체의 합
		
		for(int[] i : array) {
			for (int k : i) {
				sum += k; // 배열에 속한 모든 숫자의 합
				count ++; //배열에 속한 숫자의 개수
				if(max < k) max = k; // k가 기존의 최대값보다 크면 k의 값을 가져온다. 
				if(min > k) min = k; // k가 기존의 최솟값보다 작으면 k의 값을 가져온다.
			}
		}
		
		System.out.println("배열 전체의 합 : " + sum );
		
		//배열 전체의 평균 

		avg = sum / count;
		System.out.println("배열 전체의 평균 : " + avg );
		
		//배열 전체의 최대값
		System.out.println("배열 전체의 최대값 : " + max);
		
		//배열 전체의 최소값
		System.out.println("배열 전체의 최소값 : " + min);
		
		//배열 전체의 분산
		double c = 0.0;
		
		for(int[] i : array) {
			for(int k : i) {
				c = k-avg;
				variance += c*c;
			}
		}
		
		variance /= count;
		System.out.println("배열 전체의 분산 : " + variance);
	}
}
