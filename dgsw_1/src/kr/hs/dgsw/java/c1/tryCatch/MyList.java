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
		list.add("대소고");
		list.add("자바 수업");
		list.add("지겹다");
		
		System.out.println(list.get(2));
		
		list.delete(1);
		
		System.out.println(list.getSize());
	}
}
