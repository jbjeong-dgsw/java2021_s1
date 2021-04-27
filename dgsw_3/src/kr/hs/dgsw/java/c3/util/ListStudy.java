package kr.hs.dgsw.java.c3.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListStudy {

	public static long testRead(List<String> list) {
		long before = System.currentTimeMillis();
		list.get(list.size() / 2);
		long after = System.currentTimeMillis();
		
		return after - before;
	}
	
	public static long makeSampleData(int size, List<String> list) {
		long before = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0 ; i < size ; i++) {
			list.add(random.nextInt() + "");
		}
		long after = System.currentTimeMillis();
		
		return after - before;
	}
	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		int size = 10000000;
		
		System.out.println("arrayList add : " + 
				makeSampleData(size, arrayList));
		System.out.println("linkedList add : " + 
				makeSampleData(size, linkedList));

		System.out.println("arrayList read : " + 
				testRead(arrayList));
		System.out.println("linkedList read : " + 
				testRead(linkedList));
		
		List<String> list = new ArrayList<String>();
		List<Integer> list1 = new LinkedList<Integer>();
		
		list.add("대소고");
		list.add("2학년 3반");
		list.add("자바 수업");
		
		String value = list.get(0);
		
		/*
		list.add(1, "2학년 2반");
		System.out.println(list.get(1));
		*/
		
		String str = list.remove(0);
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		
		
	}
	
}
