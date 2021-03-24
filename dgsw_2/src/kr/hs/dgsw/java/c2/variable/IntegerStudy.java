package kr.hs.dgsw.java.c2.variable;

public class IntegerStudy {
	public static void main(String[] args) {
		int intValue;
		short shortValue;
		long longValue;
		byte byteValue;
		char charValue;
		
		System.out.println("Byte : " + Byte.BYTES);
		System.out.println("Short : " + Short.BYTES);
		System.out.println("Int : " + Integer.BYTES);
		
		System.out.println("Byte Range : " + 
				Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("Short Range : " + 
				Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		
		System.out.println("Int Range : " + 
				Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		System.out.println("Long Range : " + 
				Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		byteValue = (byte)(127 + 1);
		System.out.println("byteValue : " + byteValue);
		
		intValue = 123456780;
		longValue = 1234567890000L;
		
		intValue = 0xFF;
		byteValue = 0b00101111;
		shortValue = 0237;
		System.out.println(intValue);
		System.out.println(byteValue);
		System.out.println(shortValue);
		
	}
}
