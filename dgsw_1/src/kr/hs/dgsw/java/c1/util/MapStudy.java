package kr.hs.dgsw.java.c1.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapStudy {
	
	private static final int SIZE = 10000000;
	
	private static Random random = new Random();
	
	public static long testListPerformance(List<Integer> list) {
		for (int i = 0 ; i < SIZE ; i++) {
			list.add(random.nextInt());
		}
		
		long before = System.currentTimeMillis();
		
		list.get(random.nextInt(SIZE));
		
		long after = System.currentTimeMillis();
		return after - before;
	}
	
	public static long testMapPerformance(Map<Integer, Integer> map) {
		for (int i = 0 ; i < SIZE ; i++) {
			map.put(i, random.nextInt());
		}
		
		long before = System.currentTimeMillis();
		map.get(random.nextInt(SIZE));
		long after = System.currentTimeMillis();
		return after - before;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		System.out.println("List : " + testListPerformance(list));
		System.out.println("Map : " + testMapPerformance(map));
		
		/*
		Map<String, Integer> historyMap = 
				new HashMap<String, Integer>();
		
		historyMap.put("갑오경장", 1894);
		historyMap.put("해방", 1945);
		historyMap.put("625사변", 1950);
		historyMap.put("조선건국", 1392);
		
		Integer year = historyMap.get("고려건국");
		System.out.println(year);
		
		boolean exist = 
				historyMap.containsKey("조선건국");
		
		Set<String> keys = historyMap.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		
		*/
		
		
	}
}
