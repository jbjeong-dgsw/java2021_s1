package kr.hs.dgsw.java.c3.array;

import java.util.Arrays;

public class BestSort extends Sort {

	@Override
	public void sort() {
		Arrays.sort(array);
	}
	
	public static void main(String[] args) {
		Sort sort = new BestSort();
		sort.fillValues();

		System.out.println("���� ��");
		sort.print();

		long before = System.currentTimeMillis();
		sort.sort();
		long after = System.currentTimeMillis();

		System.out.println("���� ��");
		sort.print();
		
		System.out.println("��� �ð� : " + (after - before));
	}
}
