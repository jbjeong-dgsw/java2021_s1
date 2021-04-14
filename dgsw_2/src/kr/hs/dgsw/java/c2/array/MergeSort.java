package kr.hs.dgsw.java.c2.array;

public class MergeSort extends Sort {
	private int[] temp;
	
	@Override
	public void sort() {
		temp = new int[array.length];
		
		doSorting(0, array.length - 1);
	}
	
	private void doSorting(int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			doSorting(left, mid);
			doSorting(mid + 1, right);
			merge(left, mid, right);
		}
	}
	
	private void merge(int left, int mid, int right) {
		int index = left;
		int i = left;
		int j = mid + 1;
		
		while (i <= mid && j <= right) {
			if (array[i] > array[j]) {
				temp[index] = array[j];
				j++;
			}
			else {
				temp[index] = array[i];
				i++;
			}
			index++;
		}
		
		if (i <= mid) {
			for (int k = i ; k <= mid ; k++) {
				temp[index++] = array[k];
			}
		}
		else {
			for (int k = j ; k <= right ; k++) {
				temp[index++] = array[k];
			}
		}
		
		for (int k = left ; k <= right ; k++) {
			array[k] = temp[k];
		}
	}
	
	public static void main(String[] args) {
		Sort sort = new MergeSort();
		
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
