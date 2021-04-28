package kr.hs.dgsw.java.c2.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {

	public static void main(String[] args) {
		
		Map<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("419혁명", 1960);
		map.put("625사변", 1950);
		map.put("임진왜란", 1592);
		map.put("조선건국", 1392);
	
		int value = map.get("임진왜란");
		System.out.println(value);
		
		map.remove("임진왜란");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		
		System.out.println("------------");
		Collection<Integer> values = map.values();
		for (Integer v : values) {
			System.out.println(v);
		}
		
	}
	
}
