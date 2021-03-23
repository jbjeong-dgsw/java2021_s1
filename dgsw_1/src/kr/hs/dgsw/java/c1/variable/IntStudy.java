package kr.hs.dgsw.java.c1.variable;

public class IntStudy {
	public static void main(String[] args) {
		System.out.println("SIZE : " + Integer.SIZE);
		System.out.println("BYTES : " + Integer.BYTES);
		System.out.println("MIN : " + Integer.MIN_VALUE);
		System.out.println("MAX : " + Integer.MAX_VALUE);
		
		int a = Integer.MAX_VALUE + 1;
		int b = Integer.MIN_VALUE - 1;
		System.out.println(a);
		System.out.println(b);
	}
}
