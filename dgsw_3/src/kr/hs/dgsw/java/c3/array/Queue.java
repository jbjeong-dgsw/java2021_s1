package kr.hs.dgsw.java.c3.array;

public class Queue {

	private static final int SIZE = 10;
	
	private String[] array = new String[SIZE];
	
	private int head = 0;
	
	private int tail = 0;
	
	public void enqueue(String value) {
		if (head > tail + array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		array[head % array.length] = value;
		head++;
	}
	
	public String dequeue() {
		if (tail >= head) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		String result = array[tail % array.length];
		tail++;
		
		return result;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue("first");
		queue.enqueue("second");
		
		System.out.println(queue.dequeue());
		
		queue.enqueue("third");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
	
}
