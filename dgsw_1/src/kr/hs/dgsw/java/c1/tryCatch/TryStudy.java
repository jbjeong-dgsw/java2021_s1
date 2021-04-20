package kr.hs.dgsw.java.c1.tryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryStudy {

	public static void method1() {
		String str = null;
		
			
		int a = 5 / 0;
			
	}
	
	public static boolean method2() {
		BufferedReader reader = null;
		try {
			File file = new File("C://abc.txt");
			FileReader fileReader = 
					new FileReader(file);
			reader = 
					new BufferedReader(fileReader);
			
			String line = reader.readLine();
			System.out.println(line);
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void method3() {
		File file = new File("C://abc.txt");
		FileReader fileReader = 
				new FileReader(file);
		BufferedReader reader = 
				new BufferedReader(fileReader);
		
		String line = reader.readLine();
		System.out.println(line);
		
		reader.close();
	}
	
	
	public static void main(String[] args) {
		//method1();
		
		//method2();
		
		try {
			method3();
		} catch (Exception e) {
			
		}
		
		
	}
	
}
