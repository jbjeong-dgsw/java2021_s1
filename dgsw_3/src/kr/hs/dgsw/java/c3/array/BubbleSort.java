package kr.hs.dgsw.java.c3.array;

public class BubbleSort extends Sort {
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Sort sort = new BubbleSort();
		sort.fillValues();
		
		System.out.println("정렬 전");
		sort.print();
		
		sort.sort();
		
		System.out.println("정렬 후");
		sort.print();
	}
}
