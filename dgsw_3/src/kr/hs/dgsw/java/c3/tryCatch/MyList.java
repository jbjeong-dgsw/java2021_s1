package kr.hs.dgsw.java.c3.tryCatch;

public class MyList {

	private Node head;
	
	/**
	 * 새로운 값을 추가한다.
	 */
	public void add(String value) {
		
	}
	
	/**
	 * 주어진 위치의 값을 리턴한다.
	 */
	public String get(int index) {
		return null;
	}
	
	/**
	 * 주어진 위치의 값을 삭제한다.
	 */
	public void remove(int index) {
		
	}
	
	/**
	 * 등록된 값들의 개수를 리턴한다.
	 */
	public int getSize() {
		return 0;
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
