package kr.hs.dgsw.java.c3.array;

import java.util.Random;

public abstract class Sort {

	private static final int SIZE = 1000000;
	
	protected int[] array = new int[SIZE];
	
	public void fillValues() {
		Random random = new Random();
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = random.nextInt(10000);
		}
	}
	
	public void print() {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(i + " : " + array[i]);
		}
	}
	
	protected void swap(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public abstract void sort();
}
