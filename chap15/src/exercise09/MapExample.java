package exercise09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> mapKeys = map.keySet(); 
		
		for(String mapKey : mapKeys){
			totalScore += map.get(mapKey);
			if(maxScore < map.get(mapKey)) {
				maxScore = map.get(mapKey);
				name = mapKey;
			}
		}
		
		System.out.println("평균 점수 : " + totalScore/map.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		
	}

}
