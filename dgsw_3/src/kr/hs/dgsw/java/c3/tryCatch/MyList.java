package kr.hs.dgsw.java.c3.tryCatch;

public class MyList {

	private Node head;
	
	/**
	 * 새로운 값을 추가한다.
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
	 * 주어진 위치의 값을 리턴한다.
	 */
	public String get(int index) {
		return getNode(index).getValue();
	}
	
	/**
	 * 주어진 위치의 값을 삭제한다.
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
	 * 등록된 값들의 개수를 리턴한다.
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
		list.add("자바");
		list.add("네트워크");
		list.add("리눅스");
		
		System.out.println(list.get(1)); // 네트워크 출력
		
		list.remove(2);
		
		System.out.println(list.getSize()); // 2 출력
	}
}
