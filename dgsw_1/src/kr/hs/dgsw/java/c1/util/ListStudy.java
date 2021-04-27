package kr.hs.dgsw.java.c1.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListStudy {

	private static final int SIZE = 10000000;

	public static long testPerformance(int size, List<Integer> list) {
		Random random = new Random();
		int value;
		
		long before = System.currentTimeMillis();
		for (int i = 0 ; i < size ; i++) {
			value = random.nextInt();
			list.add(value);
		}
		long after = System.currentTimeMillis();
		
		return after - before;
	}
	
	public static void testBySize(List<Integer> list) {
		
		for (int i = 1000000 ; i <= 10000000 ; i += 1000000) {
			System.out.println(i + " : " + testPerformance(i, list));
		}
		
	}

	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new ArrayList<Integer>();
		
		//System.out.println("ArrayList : " + testPerformance(SIZE, arrayList));
		//System.out.println("LinkedList : " + testPerformance(SIZE, linkedList));
		
		testBySize(arrayList);
		testBySize(linkedList);
		
		List<String> list = new ArrayList<String>();
		//List<String> list = new LinkedList<String>();
		List<Integer> list1 = new LinkedList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		
		list.add("대구소프트웨어고등학교");
		list.add("2학년 1반");
		list.add("3");
		//list.add(0, "대한민국");
		
		String str1 = list.get(1);
		boolean exist = list.contains("대구소프트웨어");
		//String str2 = list.get(15);
		//System.out.println(str2);
		
		list.remove(1);
		list.remove("대구소프트웨어고등학교");
		
		
		list1.add(5);
		list1.add(8);
		list1.add(4);
		
	}
	
}
