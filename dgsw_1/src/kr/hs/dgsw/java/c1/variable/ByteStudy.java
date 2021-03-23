package kr.hs.dgsw.java.c1.variable;

import java.util.Scanner;

public class ByteStudy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		byte byteValue = scanner.nextByte();
		
		// 10진수를 16진수로 바꾸어 출력한다.
		String hex = convertToHexString(byteValue);
		System.out.println(byteValue + " -> 0x" + hex);
		
		scanner.close();
	}
	
	private static String convertToHexString(byte byteValue) {
		String result = "";
		
		int high = byteValue / 16;
		int low = byteValue % 16;
		
		result += convertToHexChar(high);
		result += convertToHexChar(low);
		
		return result;
	}
	
	private static String convertToHexChar(int value)
	{
		switch (value) {
		case 10: {
			return "A";
		}
		case 11: {
			return "B";
		}
		case 12: {
			return "C";
		}
		case 13: {
			return "D";
		}
		case 14: {
			return "E";
		}
		case 15: {
			return "F";
		}
		default:
			return value + "";
		}
	}
	
	
}
