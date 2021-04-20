package kr.hs.dgsw.java.c1.tryCatch;

public class MyList {

	private MyListNode head;
	
	public void add(String value) {
		MyListNode node = new MyListNode();
		node.setValue(value);
		
		if (head == null) {
			head = node;
		} else {
			MyListNode pointer = head;
			while (true) {
				if (pointer.getNext() == null) {
					pointer.setNext(node);
					break;
				} else {
					pointer = pointer.getNext();
				}
			}
		}
	}

	public void delete(int index) {
		
	}

	public String get(int index) {
		return getNode(index).getValue();
	}
	
	public int getSize() {
		return 0;
	}
	
	private MyListNode getNode(int index) {
		MyListNode node = head;
		
		if (node == null || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for (int i = 0 ; i < index ; i++) {
			node = node.getNext();
			if (node == null) {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		
		return node;
	}

	
	public static void main(String[] args) {
		
		MyList list = new MyList();
		
		list.add("대소고");
		list.add("자바 수업");
		list.add("지겹다");
		
		System.out.println(list.get(1));
		
		list.delete(1);
		
		System.out.println(list.getSize());
	}
}
