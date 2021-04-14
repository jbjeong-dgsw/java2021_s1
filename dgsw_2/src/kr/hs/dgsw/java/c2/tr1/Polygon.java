package kr.hs.dgsw.java.c2.tr1;

import java.util.Scanner;

public abstract class Polygon {
	
	protected Scanner scanner;

	public Polygon() {
		scanner = new Scanner(System.in);
	}
	
	protected void closeScanner() {
		scanner.close();
	}
	
	protected abstract void input();
	
	public abstract double getArea();
	
	public abstract String getName();
	
	public void printArea() {
		System.out.println(getName() + "ÀÇ ¸éÀû : " + getArea());
	}
	
}
