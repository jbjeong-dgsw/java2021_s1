package kr.hs.dgsw.java.c1.tr1;

import java.util.Scanner;

public abstract class Polygon {
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
	
	public abstract void input();
	
	public abstract String getName();
	
	public abstract double calculateArea();
	
	public void printArea() {
		System.out.println(getName() + "ÀÇ ¸éÀû : " + calculateArea());
	}
}
