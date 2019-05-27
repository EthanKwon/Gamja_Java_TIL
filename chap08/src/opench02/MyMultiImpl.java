package opench02;

public class MyMultiImpl implements MyMulti{
	
	public int max(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (max < num) max = num;
		}
		return max;
	}
	
	public int min(int[] arr) {
		int min = arr[0];
		for (int num : arr) {
			if (min > num) min = num;
		}
		return min;
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}
	
	public double avg(int[] arr) {
		double avg = 0;
		for (int num : arr) {
			avg += num;
		}
		avg /= (double)arr.length;
		return avg;
	}

}
