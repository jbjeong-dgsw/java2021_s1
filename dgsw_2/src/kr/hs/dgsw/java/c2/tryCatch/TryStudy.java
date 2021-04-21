package kr.hs.dgsw.java.c2.tryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryStudy {

	public static int divide() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("두 정수를 입력하세요.");
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			System.out.println(String.format("%d / %d = %d", 
					value1, value2, (value1 / value2)));
			
			return value1 / value2;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하라고 이 멍청아.");
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
		} finally {
			scanner.close();
		}

		throw new RuntimeException();
	}
	
	public static void readFile() {
		try {
			File file = new File("C://abc.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String firstLine = reader.readLine();
			System.out.println(firstLine);
			
			reader.close();
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		}
	}

	public static void readFile1() 
			throws FileNotFoundException, IOException {
		
		File file = new File("C://abc.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		String firstLine = reader.readLine();
		System.out.println(firstLine);
		
		reader.close();
	}

	public static void method1() throws Exception {
		
		Exception e = new Exception("샘플 예외");
		throw e;
		
	}
	
	public static void method2() throws RuntimeException {
		
		RuntimeException e = new RuntimeException();
		throw e;
	}
	
	public static void main(String[] args) {
		divide();
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		method2();
		
	}
	
}
