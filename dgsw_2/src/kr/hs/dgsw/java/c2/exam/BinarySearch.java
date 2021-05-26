package kr.hs.dgsw.java.c2.exam;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	private static final int SIZE = 100000;
	
	private Random random = new Random();
	
	private int value;
	
	/**
	 * 주어진 list는 오름차순으로 정렬되어 있습니다.
	 * 주어진 list에서 주어진 value 가 저장되어 있는 위치를 찾아서 리턴하세요.
	 * 만약 list 안에 value가 없을 경우에는 -1을 리턴하세요.
	 * 
	 * @param value 찾아야 할 값
	 * @return list 내부에서 value 가 저장되어 있는 배열의 index, 없으면 -1
	 */
	public int findIndex(int[] list, int value) {
		// TODO 이 부분을 완성하세요.
		return 0;
	}
	
	public int[] makeSampleData() {
		int[] list = new int[SIZE];
		
		for (int i = 0 ; i < list.length ; i++) {
			list[i] = random.nextInt(SIZE);
		}
		
		value = list[random.nextInt(SIZE)];
		
		Arrays.sort(list);
		
		return list;
	}
	
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] list = binarySearch.makeSampleData();
		
		int index = binarySearch.findIndex(list, binarySearch.value);
		System.out.println("index : " + index + "  " + binarySearch.value + "  " + list[index]);
	}
}
