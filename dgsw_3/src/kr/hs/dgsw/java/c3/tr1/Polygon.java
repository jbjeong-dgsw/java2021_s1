package kr.hs.dgsw.java.c3.tr1;

import java.util.Scanner;

public class Polygon {

	protected Scanner scanner;
	
	public Polygon() {
		scanner = new Scanner(System.in);
	}
	
	protected void closeScanner() {
		scanner.close();
	}
	
	protected void input() {
		// do nothing
	}
	
	public double getSize() {
		return 0;
	}

	public String getName() {
		return "�ٰ���";
	}
	
	public void printSize() {
		System.out.println(getName() + "�� ���� : " + getSize());
	}
}
