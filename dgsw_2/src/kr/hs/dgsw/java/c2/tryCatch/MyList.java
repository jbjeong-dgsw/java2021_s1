package kr.hs.dgsw.java.c2.tryCatch;

public class MyList {

	private Node head;
	
	/**
	 * 데이터 넣기
	 */
	public void insert(String value)
	{
		Node node = new Node();
		node.setData(value);
		
		if (head == null) {
			head = node;
		}
		else {
			Node trace = head;
			while (true) {
				Node next = trace.getNext();
				
				if (next == null) {
					trace.setNext(node);
					break;
				}
				
				trace = next;
			}
		}
	}
	
	/**
	 * 데이터 읽기
	 */
	public String read(int index) {
		return getNode(index).getData();
	}
	
	/**
	 * 데이터 삭제
	 */
	public void delete(int index) {
		if (index == 0) {
			if (head == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
			
			head = head.getNext();
		} else {
			Node prev = getNode(index - 1);
			Node forDeleted = prev.getNext();
			
			if (forDeleted == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
			prev.setNext(forDeleted.getNext());
		}
	}
	
	/**
	 * 리스트의 길이
	 */
	public int length() {
		int count = 0;
		Node trace = head;
		
		while (trace != null) {
			count++;
			trace = trace.getNext();
		}
		
		return count;
	}
	
	private Node getNode(int index) {
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		Node trace = head;
		for (int i = 0 ; i < index ; i++) {
			trace = trace.getNext();
			if (trace == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
	
		return trace;
	}
	
	
	public static void main(String[] args) {
		MyList list = new MyList();
		
		System.out.println("리스트의 길이 : " + list.length()); // 0
		
		list.insert("자바");
		list.insert("네트워크");
		list.insert("데이터베이스");

		System.out.println("리스트의 길이 : " + list.length()); // 3
		
		System.out.println(list.read(1)); // 네트워크

		list.delete(2);
		System.out.println("리스트의 길이 : " + list.length()); // 2
	
		System.out.println(list.read(2)); // ArrayIndexOutOfBoundsException 발생
		System.out.println(list.read(-1)); // ArrayIndexOutOfBoundsException 발생
		
	}
}
