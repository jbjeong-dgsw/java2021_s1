package kr.hs.dgsw.java.c3.array;

public class BubbleSort extends Sort {
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Sort sort = new BubbleSort();
		sort.fillValues();
		
		System.out.println("���� ��");
		sort.print();
		
		sort.sort();
		
		System.out.println("���� ��");
		sort.print();
	}
}
