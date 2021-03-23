package kr.hs.dgsw.java.c3.variable;

import java.util.Scanner;

public class Hex {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int decimal = scanner.nextInt();
		
		String hex = convertToHexString(decimal);
		System.out.println("0x" + hex);
		
		scanner.close();
	}

	private static String convertToHexString(int decimal) {
		String result = "";
		
		while (decimal > 0)
		{
			int remainder = decimal % 16;
			result = covertToHexChar(remainder) + result ;
			decimal /= 16;
		}
		
		return result;
	}
	
	private static String covertToHexChar(int value)
	{
		switch (value)
		{
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		default:
			return value + "";
		}
	}
}
