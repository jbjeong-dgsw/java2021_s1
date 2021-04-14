package kr.hs.dgsw.java.c2.array;

public class InsertionSort extends Sort {
	@Override
	public void sort() {
		int j;
		
		for (int i = 1 ; i < array.length ; i++) {
			int key = array[i];
			
			for (j = i - 1 ; j >= 0 ; j--) {
				if (key < array[j]) {
					array[j + 1] = array[j];
				}
				else {
					break;
				}
			}
			
			array[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		Sort sort = new InsertionSort();
		
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
