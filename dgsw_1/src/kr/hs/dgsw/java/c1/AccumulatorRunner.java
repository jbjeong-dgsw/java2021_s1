package kr.hs.dgsw.java.c1;

import java.util.Scanner;

public class AccumulatorRunner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Accumulator accumulator = new Accumulator(0);

		System.out.println("정수를 입력하세요.");
		int input;
		while (-99 != (input = scanner.nextInt()))
		{
			accumulator.add(input);
			System.out.println("누적값 : " + 
					accumulator.getSum());
			System.out.println("정수를 입력하세요.");
		}
		
		scanner.close();
		
		System.out.println("프로그램 종료");
	}
}
