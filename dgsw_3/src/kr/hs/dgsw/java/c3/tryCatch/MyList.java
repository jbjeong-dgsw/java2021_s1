package kr.hs.dgsw.java.c3.tryCatch;

public class MyList {

	private Node head;
	
	/**
	 * ���ο� ���� �߰��Ѵ�.
	 */
	public void add(String value) {
		
	}
	
	/**
	 * �־��� ��ġ�� ���� �����Ѵ�.
	 */
	public String get(int index) {
		return null;
	}
	
	/**
	 * �־��� ��ġ�� ���� �����Ѵ�.
	 */
	public void remove(int index) {
		
	}
	
	/**
	 * ��ϵ� ������ ������ �����Ѵ�.
	 */
	public int getSize() {
		return 0;
	}
	
	public static void main(String[] args) {
		
		MyList list = new MyList();
		list.add("�ڹ�");
		list.add("��Ʈ��ũ");
		list.add("������");
		
		System.out.println(list.get(1)); // ��Ʈ��ũ ���
		
		list.remove(2);
		
		System.out.println(list.getSize()); // 2 ���
	}
}
