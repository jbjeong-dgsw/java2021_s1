package kr.hs.dgsw.java.c3.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		map.put("419혁명", 1960);
		map.put("임진왜란", 1592);
		map.put("조선건국", 1392);
		map.put("한글반포", 1446);

		Integer value = map.get("조선건국");
		value = map.get("병인양요");
		
		value = map.remove("임진왜란");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
	}
	
}
