package sec03_hashcode;

import java.util.HashMap;

public class keyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//hashMap에 값을 넣는 방법은 put을 이용하는 것이다.
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(2), "임꺽정");
		
		//hashMap.get을 통해 해당 key에 해당하는 값을 가져온다.
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		value = hashMap.get(new Key(2));
		System.out.println(value);
	}

}
