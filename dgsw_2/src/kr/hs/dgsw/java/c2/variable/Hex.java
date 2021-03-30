package kr.hs.dgsw.java.c2.variable;

import java.util.Scanner;

public class Hex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intValue = scanner.nextInt();

		String hex = convertToHexString(intValue);
		System.out.println(intValue + " -> " + hex);

		scanner.close();
	}

	private static String convertToHexString(int value) {
		String result = "";

		while (value > 0) {
			int remainder = value % 16;
			String char1 = convertToHexChar(remainder);
			result = char1 + result;

			value /= 16;
		}

		return result;
	}

	private static String convertToHexChar(int value) {
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
