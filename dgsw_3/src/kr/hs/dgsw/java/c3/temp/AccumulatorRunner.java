package kr.hs.dgsw.java.c3.temp;

import java.util.Scanner;

import kr.hs.dgsw.java.c3.Accumulator;

public class AccumulatorRunner {
	public static void main(String[] args) {
		Accumulator accumulator = new Accumulator();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수를 입력하세요.");
			int value = scanner.nextInt();
			
			if (accumulator.checkQuit(value))
			{
				break;
			}
			
			accumulator.add(value);
			accumulator.print();
		}
		
		scanner.close();
		
		System.out.println("프로그램 종료");
	}
}
