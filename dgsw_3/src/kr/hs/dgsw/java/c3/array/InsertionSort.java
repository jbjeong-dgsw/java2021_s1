package kr.hs.dgsw.java.c3.array;

public class InsertionSort extends Sort {
	@Override
	public void sort() {
		for (int i = 0 ; i < array.length ; i++) {
			int minimumIndex = findMinimumIndex(i);
			if (array[i] != array[minimumIndex]) {
				swap(i, minimumIndex);
			}
		}
	}
	
	private int findMinimumIndex(int left) {
		int index = left;
		for (int i = left + 1 ; i < array.length ; i++) {
			if (array[index] > array[i]) {
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Sort sort = new InsertionSort();
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
