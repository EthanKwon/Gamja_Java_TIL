package exam15;

public class Palindrome {
	public static void main(String[] args) {
		int maxPalindRome = 0;
		for (int i = 100; i < 1000; i++) {
			for (int k = 100; k < 1000; k++) {
				if (isPalindrome(i*k)) {
					if (maxPalindRome < i * k)
						maxPalindRome = i * k;
				}
			}
		}

		System.out.println("가장 큰 대칭수는 " + maxPalindRome + "입니다.");

	}

	static boolean isPalindrome(int number) {
		StringBuilder oldStr = new StringBuilder(Integer.toString(number));
		StringBuilder newStr = new StringBuilder(Integer.toString(number));
		newStr.reverse();
		if (newStr.toString().equals(oldStr.toString())) {
			return true;
		}
		return false;
	}

}
