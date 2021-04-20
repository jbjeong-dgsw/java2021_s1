package kr.hs.dgsw.java.c3.tryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryStudy {

	public static int method1() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("두 정수를 입력하세요.");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();

			System.out.println("나누기 : " + (value1 / value2));
			return value1 / value2;
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하라고 멍청아!");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없답니다.");
		} catch (Exception e) {
			
		}
		finally {
			scanner.close();
		}
		
		return 0;
	}
	
	public static void method2() {
		
		try {
			File file = new File("C://abc.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = reader.readLine();
			System.out.println(line);
			
			reader.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	public static void method3() throws Exception {
		
		File file = new File("C://abc.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		String line = reader.readLine();
		System.out.println(line);
		
		reader.close();
	}
	
	public static void method4() {
		
		// .......
		
		try {
			Exception e = new Exception();
			throw e;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		// ......
		
	}
	
	public static void method5() throws RuntimeException {
		
	}
	
	public static void main(String[] args) {
		method1();
		
		try {
			method3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		method5();
	}
	
}
