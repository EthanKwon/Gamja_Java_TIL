package openchallenge04;

public class CountNum {
	public static void main(String[] args) {
		int[] num = new int[1000];
		int[] sum = new int[10];
		
		for(int i = 0; i<num.length;i++) {
			num[i] = i+1;
			
			int num1 = num[i]%10;
			int num10 = (num[i]%100)/10;
			int num100 = (num[i]%1000)/100;
			int num1000 = num[i]/1000;
			
			if (i<10) {
				for(int a = 0; a<sum.length;a ++) {
					if (num1 == a) sum[a] ++;
				}
			} else if (i >= 10 & i < 100) {
				for(int a = 0; a<sum.length;a ++) {
					if (num1 == a) sum[a] ++;
					if (num10 == a) sum[a] ++;
				}
			} else if (i >=100 & i < 1000) {
				for(int a = 0; a<sum.length;a ++) {
					if (num1 == a) sum[a] ++;
					if (num10 == a) sum[a] ++;
					if (num100 == a) sum[a] ++;
				}
			} else {
				for(int a = 0; a<sum.length;a ++) {
					if (num1 == a) sum[a] ++;
					if (num10 == a) sum[a] ++;
					if (num100 == a) sum[a] ++;
					if (num1000 == a) sum[a] ++;
				}
			}
			
//			System.out.println(num1000 + " " + num100 + " " + num10 + " " + num1);
			
		}
		System.out.println("--------------");
		System.out.println("각 숫자의 개수");
		System.out.println("--------------");
		for(int i = 0; i<sum.length;i++) {
			System.out.println(i + "의 개수 : " + sum[i]);
		}
	}

}
