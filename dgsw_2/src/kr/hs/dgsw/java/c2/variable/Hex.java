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
		String result = null;
		
		// TODO
		
		return result;
	}
}
