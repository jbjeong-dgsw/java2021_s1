package kr.hs.dgsw.java.c1.tryCatch;

public class MyList {

	public void add(String value) {
		
	}

	public void delete(int index) {
		
	}

	public String get(int index) {
		return null;
	}
	
	public int getSize() {
		return 0;
	}
	
	public static void main(String[] args) {
		
		MyList list = new MyList();
		list.add("��Ұ�");
		list.add("�ڹ� ����");
		list.add("�����");
		
		System.out.println(list.get(2));
		
		list.delete(1);
		
		System.out.println(list.getSize());
	}
}
