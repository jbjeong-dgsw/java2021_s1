package kr.hs.dgsw.java.c3.tryCatch;

public class MyList {

	private Node head;
	
	/**
	 * ���ο� ���� �߰��Ѵ�.
	 */
	public void add(String value) {
		Node node = new Node();
		node.setValue(value);
		
		if (head == null) {
			head = node;
		} else {
			Node pointer = head;
			
			while (pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
			
			pointer.setNext(node);
		}
	}
	
	/**
	 * �־��� ��ġ�� ���� �����Ѵ�.
	 */
	public String get(int index) {
		return getNode(index).getValue();
	}
	
	/**
	 * �־��� ��ġ�� ���� �����Ѵ�.
	 */
	public void remove(int index) {
		if (index > 0) {
			Node prev = getNode(index - 1);
			Node node = prev.getNext();
			
			if (node == null) {
				throw new ArithmeticException();
			}
			
			prev.setNext(node.getNext());
		} else {
			if (head == null) {
				throw new ArithmeticException();
			}
			head = head.getNext();
		}
	}
	
	/**
	 * ��ϵ� ������ ������ �����Ѵ�.
	 */
	public int getSize() {
		Node pointer = head;
		
		int count = 0;
		while (pointer != null) {
			count++;
			pointer = pointer.getNext();
		}
		
		return count;
	}
	
	private Node getNode(int index) {
		if (index < 0) {
			throw new IllegalArgumentException();
		}
		
		Node pointer = head;
		for (int i = 0 ; i < index ; i++) {
			if (pointer == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
			
			pointer = pointer.getNext();
		}
		
		if (pointer == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return pointer;
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
