package kr.hs.dgsw.java.c2.tryCatch;

public class MyList {

	private Node head;
	
	/**
	 * ������ �ֱ�
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
	 * ������ �б�
	 */
	public String read(int index) {
		return getNode(index).getData();
	}
	
	/**
	 * ������ ����
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
	 * ����Ʈ�� ����
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
		
		System.out.println("����Ʈ�� ���� : " + list.length()); // 0
		
		list.insert("�ڹ�");
		list.insert("��Ʈ��ũ");
		list.insert("�����ͺ��̽�");

		System.out.println("����Ʈ�� ���� : " + list.length()); // 3
		
		System.out.println(list.read(1)); // ��Ʈ��ũ

		list.delete(2);
		System.out.println("����Ʈ�� ���� : " + list.length()); // 2
	
		System.out.println(list.read(2)); // ArrayIndexOutOfBoundsException �߻�
		System.out.println(list.read(-1)); // ArrayIndexOutOfBoundsException �߻�
		
	}
}
