package kr.hs.dgsw.java.c2.tryCatch;

public class MyList {

	/**
	 * ������ �ֱ�
	 */
	public void insert(String value)
	{
		
	}
	
	/**
	 * ������ �б�
	 */
	public String read(int index) {
		return null;
	}
	
	/**
	 * ������ ����
	 */
	public void delete(int index) {
		
	}
	
	/**
	 * ����Ʈ�� ����
	 */
	public int length() {
		return 0;
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
		
		System.out.println(list.read(2)); // ArrayIndexOutOfBoundsException �߻�
		System.out.println(list.read(-1)); // ArrayIndexOutOfBoundsException �߻�
		
	}
}
