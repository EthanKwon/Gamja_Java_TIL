package sec04_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		System.out.println("총 Entry 수 : " + map.size());
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		System.out.println("For문으로 Iterator 이용하기");

		for(String name : map.keySet() ) {
			System.out.println("\t" + name + " : " + map.get(name));
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		System.out.println("For문으로 entrySet() 이용하기");
		for(Map.Entry<String, Integer> MapFor : map.entrySet()) {
			System.out.println("\t" + MapFor.getKey() + " : " + MapFor.getValue());
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
	

}
