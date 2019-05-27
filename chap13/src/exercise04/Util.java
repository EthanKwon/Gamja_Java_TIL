package exercise04;

public class Util {
	public static <K,V> V getValue(Pair<K,V> p1, String str1) {
		if (p1.getKey().equals(str1)) {
			return p1.getValue();
		} else {
			return null;
		}
	}
}
