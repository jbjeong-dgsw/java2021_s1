package kr.hs.dgsw.java.c2.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {

	public static void main(String[] args) {
		
		Map<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("419����", 1960);
		map.put("625�纯", 1950);
		map.put("�����ֶ�", 1592);
		map.put("�����Ǳ�", 1392);
	
		int value = map.get("�����ֶ�");
		System.out.println(value);
		
		map.remove("�����ֶ�");
		
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
