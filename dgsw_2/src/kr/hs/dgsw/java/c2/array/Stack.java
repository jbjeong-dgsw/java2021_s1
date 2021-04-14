package kr.hs.dgsw.java.c2.array;

public class Stack {
	private static final int SIZE = 10;
	
	private String[] array = new String[SIZE];
	
	private int cursor = 0;
	
	public void push(String value) {
		array[cursor] = value;
		cursor++;
	}
	
	public String pop() {
		cursor--;
		return array[cursor];
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("�����");
		stack.push("���ͽ��ڶ�");
		
		System.out.println(stack.pop());
	}
}
