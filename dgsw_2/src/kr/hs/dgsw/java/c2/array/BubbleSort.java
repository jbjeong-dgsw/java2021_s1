package kr.hs.dgsw.java.c2.array;

public class BubbleSort extends Sort {
	@Override
	public void sort() {
		// TODO
		
	}
	
	public static void main(String[] args) {
		Sort sort = new BubbleSort();
		
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
