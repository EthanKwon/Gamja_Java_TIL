package opench03;

public class MySortImpl implements MySort {
	
	public String[] sort(String[] strArray) {
		String temp;
		for(int i =0; i <strArray.length;i++) {
			for (int k=1;k<strArray.length;k++) {
				int num = strArray[k-1].compareTo(strArray[k]);
				if( num > 0) {
					temp = strArray[k];
					strArray[k] = strArray[k-1];
					strArray[k-1] = temp;
				}
			}
		}
		return strArray;	
	}
	
	public String[] sort(String[] strArray, boolean descOrder) {
		String temp;
		if (descOrder) { //내림 차순
			for(int i =0; i <strArray.length;i++) {
				for (int k=1;k<strArray.length;k++) {
					if(strArray[k-1].compareTo(strArray[k]) < 0) {
						temp = strArray[k];
						strArray[k] = strArray[k-1];
						strArray[k-1] = temp;
					}
				}
			}
			
		} else { //오름 차순
				for(int i =0; i <strArray.length;i++) {
					for (int k=1;k<strArray.length;k++) {
						if(strArray[k-1].compareTo(strArray[k]) > 0) {
							temp = strArray[k];
							strArray[k] = strArray[k-1];
							strArray[k-1] = temp;
						}
					}
				}
				
			}
		
		return strArray;	

	
	}

	@Override
	public void toString(String[] strArray) {
		System.out.println("----");
		System.out.println("정렬");
		System.out.println("----");
		for(String str : strArray) {
			System.out.println(str);
		}
	}
	
	
	

}
