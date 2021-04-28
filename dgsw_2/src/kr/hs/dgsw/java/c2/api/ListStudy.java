package kr.hs.dgsw.java.c2.api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListStudy {

	private static final Random random = new Random();
	
	public static long measureInsert(int size, List<Integer> list) {
		long before = System.currentTimeMillis();
		for (int i = 0 ; i < size ; i++) {
			list.add(random.nextInt());
		}
		long after = System.currentTimeMillis();
		
		return (after - before);
	}
	
	public static long measureRead(List<Integer> list) {
		long before = System.currentTimeMillis();
		list.get(list.size() / 2);
		long after = System.currentTimeMillis();
		
		return (after - before);
	}

	public static long measureRemove(List<Integer> list) {
		long before = System.currentTimeMillis();
		list.remove(list.size() / 2);
		long after = System.currentTimeMillis();
		
		return (after - before);
	}

	public static void printAll(List<String> list) {
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("대소고");
		list.add("2학년 2반");
		list.add("자바 수업");
		list.add("수요일");
		printAll(list);

		System.out.println("------------");
		list.add(2, "데이터베이스");
		list.remove(3);
		printAll(list);
		
		list.add(4,  "이건 어때?");
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		int size = 10000000;
		
		System.out.println("arrayList insert : " + 
				measureInsert(size, arrayList));
		System.out.println("linkedList insert : " + 
				measureInsert(size, linkedList));

		System.out.println("arrayList read : " + 
				measureRead(arrayList));
		System.out.println("linkedList read : " + 
				measureRead(linkedList));

		System.out.println("arrayList remove : " + 
				measureRemove(arrayList));
		System.out.println("linkedList remove : " + 
				measureRemove(linkedList));
		
		arrayList.sort(null);
		

	}
}
