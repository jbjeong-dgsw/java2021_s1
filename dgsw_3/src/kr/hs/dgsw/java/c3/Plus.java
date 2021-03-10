package kr.hs.dgsw.java.c3;

public class Plus {

	static int sum(int value1, int value2) {
		return value1 + value2;
	}

	static void display(int value1, int value2, int sum) {
		String result = 
				String.format("%d + %d = %d", 
						value1, value2, sum);

		System.out.println(result);
	}

	public static void main(String[] args) {
		int value1 = 8;
		int value2 = 12;

		display(value1, value2, sum(value1, value2));
	}
}
