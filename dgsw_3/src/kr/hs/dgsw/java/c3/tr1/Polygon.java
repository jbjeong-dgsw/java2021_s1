package kr.hs.dgsw.java.c3.tr1;

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
	
	public abstract double getSize();

	public abstract String getName();
	
	public void printSize() {
		System.out.println(getName() + "¿« ≥–¿Ã : " + getSize());
	}
}
