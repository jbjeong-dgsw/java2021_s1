package kr.hs.dgsw.java.c2.tr1;

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
		// do nothing;
	}
	
	public double getArea() {
		return 0;
	}
	
	public String getName() {
		return "�ٰ���";
	}
	
	public void printArea() {
		System.out.println(getName() + "�� ���� : " + getArea());
	}
	
}
