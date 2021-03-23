package kr.hs.dgsw.java.c3.variable;

public class IntegerStudy {

	public static void main(String[] args) {
		
		byte byteValue = 1;
		short shortValue = 1;
		char charValue = 1;
		int intValue = 1;
		long longValue = 1;
		
		System.out.println("Byte : " + Byte.MAX_VALUE);
		System.out.println("Size of Byte : " + Byte.SIZE);

		System.out.println("Short : " + Short.MAX_VALUE);
		System.out.println("Size of Short : " + Short.SIZE);

		System.out.println("Int : " + Integer.MAX_VALUE);
		System.out.println("Size of Int : " + Integer.SIZE);

		System.out.println("Long : " + Long.MAX_VALUE);
		System.out.println("Size of Long : " + Long.SIZE);

		System.out.println("Char : " + (Character.MAX_VALUE + 0));
		System.out.println("Size of Char : " + Character.SIZE);

		byteValue = (byte)128;
		System.out.println(byteValue);
		
		shortValue = 31;
		intValue = 0x1F;
		byteValue = 0b00011111;
		longValue = 037;
		
		System.out.println(String.format("%X %x", 1459, 1459));
		
	}
	
}
