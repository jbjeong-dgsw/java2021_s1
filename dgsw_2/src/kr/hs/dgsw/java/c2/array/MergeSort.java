package kr.hs.dgsw.java.c2.array;

public class MergeSort extends Sort {
	@Override
	public void sort() {
		
	}
	
	public static void main(String[] args) {
		Sort sort = new MergeSort();
		
		sort.fillValues();
		
		System.out.println("���� ��");
		sort.printArray();
		
		long before = System.currentTimeMillis();
		sort.sort();
		long after = System.currentTimeMillis();
		
		System.out.println("���� ��");
		sort.printArray();
		
		System.out.println("��� �ð� : " + (after - before));
	}
}
