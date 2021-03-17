package kr.hs.dgsw.java.c2;

import java.util.Scanner;

public class AccumulateRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Accumulate accumulate = new Accumulate();

		while (true)
		{
			System.out.println("정수를 입력하세요.");
			int value = scanner.nextInt();
			
			if (-9999 == value) {
				break;
			}
			
			accumulate.add(value);
			accumulate.display();	
		}
		
		System.out.println("종료");
		
		scanner.close();
	}
	
}
