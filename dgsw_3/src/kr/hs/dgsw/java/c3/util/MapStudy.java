package kr.hs.dgsw.java.c3.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		map.put("419����", 1960);
		map.put("�����ֶ�", 1592);
		map.put("�����Ǳ�", 1392);
		map.put("�ѱ۹���", 1446);

		Integer value = map.get("�����Ǳ�");
		value = map.get("���ξ��");
		
		value = map.remove("�����ֶ�");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
	}
	
}
