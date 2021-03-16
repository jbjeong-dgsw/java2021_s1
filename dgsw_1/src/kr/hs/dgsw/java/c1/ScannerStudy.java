package kr.hs.dgsw.java.c1;

import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("문자열을 입력해 주세요.");
			String str = scanner.next();
			
			if ("quit".equals(str))
			{
				break;
			}
			
			System.out.println("Read : " + str);
		}
		
		scanner.close();
		
		System.out.println("프로그램 종료");
	}
	
}
