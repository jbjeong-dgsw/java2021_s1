package kr.hs.dgsw.java.c3.tr1;

import java.util.Scanner;

public class Factorization {

public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		num = scanner.nextInt();
		
//		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				System.out.println(i);
//				list.add(i);
				num /= i;
			}
		}
		
//		for(int i:list) {
//			System.out.println(i);
//		}
	
		
	}
}
