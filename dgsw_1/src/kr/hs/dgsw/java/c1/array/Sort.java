package kr.hs.dgsw.java.c1.array;

import java.util.Arrays;
import java.util.Random;

public class Sort {

	private static final int SIZE = 10000000;
	
	private int[] array = new int[SIZE];
	
	public void fillValues() {
		Random random = new Random();
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = random.nextInt(100000000);
		}
	}
	
	public void sort() {
		// 과제
		//doBubbleSorting();
		//doInsertionSort();
		//doMergeSorting(0, array.length - 1);
		doDefaultSorting();
	}
	
	private void doBubbleSorting() {
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = i + 1 ; j < array.length ; j++) {
				if (array[i] > array[j])
				{
					swap(i, j);
				}
			}
		}
	}
	
	private void doInsertionSort() {
		for (int i = 0 ; i < array.length ; i++) {
			int min = findMinIndex(i);
			if (min != i) {
				swap(i, min);
			}
		}
	}
	
	private int findMinIndex(int index) {
		int min = index;
		for (int i = index + 1 ; i < array.length; i++) {
			if (array[i] < array[min]) {
				min = i;
			}
		}
		
		return min;
	}
	
	private void doMergeSorting(int left, int right) {
		
		if (left < right) {
			int mid = (left + right) / 2;
			doMergeSorting(left, mid);
			doMergeSorting(mid + 1, right);
			merge(left, mid, right);
		}
	}
	
	private void merge(int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		int[] temp = new int[SIZE];
		
		while (i <= mid && j <= right) {
			if (array[i] <= array[j]) {
				temp[k++] = array[i++];
			}
			else {
				temp[k++] = array[j++];
			}
		}
		
		if (i > mid) {
			for (int l = j ; l <= right ; l++) {
				temp[k++] = array[l];
			}
		}
		else {
			for (int l = i ; l <= mid ; l++) {
				temp[k++] = array[l];
			}
		}
			
		for (int l = left; l <= right ; l++) {
			array[l] = temp[l];
		}
	}
	
	private void swap(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	private void doDefaultSorting() {
		Arrays.sort(array);
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
		//sort.print();

		long before = System.currentTimeMillis();
		sort.sort();
		long after = System.currentTimeMillis();

		System.out.println("정렬 후");
		//sort.print();
		
		System.out.println("수행시간 : " + (after - before));
	}
}
