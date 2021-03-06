package kr.hs.dgsw.java.c3.array;

public class BubbleSort extends Sort {
	@Override
	public void sort() {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(i, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Sort sort = new BubbleSort();
		sort.fillValues();

		System.out.println("정렬 전");
		sort.print();

		long before = System.currentTimeMillis();
		sort.sort();
		long after = System.currentTimeMillis();

		System.out.println("정렬 후");
		sort.print();
		
		System.out.println("경과 시간 : " + (after - before));
	}
}
