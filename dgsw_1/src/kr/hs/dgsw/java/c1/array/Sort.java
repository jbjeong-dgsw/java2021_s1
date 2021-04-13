package kr.hs.dgsw.java.c1.array;

import java.util.Random;

public class Sort {

	private static final int SIZE = 100;
	
	private int[] array = new int[SIZE];
	
	public void fillValues() {
		Random random = new Random();
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = random.nextInt(10000);
		}
	}
	
	public void sort() {
		// 과제
	}
	
	public void print() {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(i + " : " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.fillValues();
		
		System.out.println("정렬 전");
		sort.print();
		
		sort.sort();
		
		System.out.println("정렬 후");
		sort.print();
	}
}
