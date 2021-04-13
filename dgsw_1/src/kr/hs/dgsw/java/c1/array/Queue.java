package kr.hs.dgsw.java.c1.array;

public class Queue {

	private static final int SIZE = 10;
	
	private String[] array = new String[SIZE];
	
	private int head = 0;
	
	private int tail = 0;
	
	
	public void add(String value) {
		array[head % SIZE] = value;
		head++;
	}
	
	public String get() {
		if (tail >= head) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		String value = array[tail % SIZE];
		tail++;
		
		return value;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("first");
		queue.add("second");
		
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		
		queue.add("third");
		queue.add("fourth");
		
		System.out.println(queue.get());
		
	}
	
}
