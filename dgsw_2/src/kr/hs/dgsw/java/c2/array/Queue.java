package kr.hs.dgsw.java.c2.array;

public class Queue {
	private static final int SIZE = 10;
	
	private String[] array = new String[SIZE];
	
	private int head = 0;

	private int tail = 0;
	
	public void enqueue(String value) {
		if ((head - tail) > SIZE) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		array[head % SIZE] = value;
		head++;
	}
	
	public String dequeue() {
		if (head <= tail) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		String value = array[tail % SIZE];
		tail++;
		
		return value;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue("어벤져스");
		queue.enqueue("인터스텔라");
		
		System.out.println(queue.dequeue());
	}
}
