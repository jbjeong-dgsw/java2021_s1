package kr.hs.dgsw.java.c2.exam;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	private static final int SIZE = 100000;
	
	private Random random = new Random();
	
	private int value;
	
	/**
	 * �־��� list�� ������������ ���ĵǾ� �ֽ��ϴ�.
	 * �־��� list���� �־��� value �� ����Ǿ� �ִ� ��ġ�� ã�Ƽ� �����ϼ���.
	 * ���� list �ȿ� value�� ���� ��쿡�� -1�� �����ϼ���.
	 * 
	 * @param value ã�ƾ� �� ��
	 * @return list ���ο��� value �� ����Ǿ� �ִ� �迭�� index, ������ -1
	 */
	public int findIndex(int[] list, int value) {
		// TODO �� �κ��� �ϼ��ϼ���.
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
