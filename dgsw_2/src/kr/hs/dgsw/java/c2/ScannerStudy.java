package kr.hs.dgsw.java.c2;

import java.util.Scanner;

public class ScannerStudy {
	public static void main(String[] args) {
		
		System.out.println("step 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("step 2");

		int i = sc.nextInt();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		String s = sc.next();
		
		System.out.println("step 3");
		System.out.println("input : " + i);

		
	}
}
