package kr.hs.dgsw.java.c1.tr1;

import java.util.Scanner;

public class Polygon {
	protected Scanner scanner;
	
	public Polygon() {
		scanner = new Scanner(System.in);
	}
	
	public void execute() {
		input();
		printArea();
	}
	
	protected void closeScanner() {
		scanner.close();
	}
	
	public void input() {
		// do nothing
	}
	
	public String getName() {
		return "�ٰ���";
	}
	
	public double calculateArea() {
		return 0.0;
	}
	
	public void printArea() {
		System.out.println(getName() + "�� ���� : " + calculateArea());
	}
}
