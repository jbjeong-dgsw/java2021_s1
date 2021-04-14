package kr.hs.dgsw.java.c2.array;

public class SelectionSort extends Sort {
	@Override
	public void sort() {
		for (int i = 0 ; i < array.length ; i++) {
			int minIndex = findMinimumIndex(i);
			
			if (i != minIndex) {
				swap(i, minIndex);
			}
		}
	}
	
	private int findMinimumIndex(int index) {
		int result = index;
		
		for (int i = index + 1 ; i < array.length ; i++) {
			if (array[result] > array[i]) {
				result = i;
			}
		}
		
		return result;
	}
	
	protected void swap(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void main(String[] args) {
		Sort sort = new SelectionSort();
		
		sort.fillValues();
		
		System.out.println("정렬 전");
		sort.printArray();
		
		long before = System.currentTimeMillis();
		sort.sort();
		long after = System.currentTimeMillis();
		
		System.out.println("정렬 후");
		sort.printArray();
		
		System.out.println("경과 시간 : " + (after - before));
	}
}
