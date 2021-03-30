package kr.hs.dgsw.java.c1.inherit;

import java.util.Scanner;

public class Adder {
	protected int operand1;
	protected int operand2;
	protected Scanner scanner;

	public Adder() {
		makeScanner();
	}

	public void execute() {
		while (true) {
			input();
			
			if (operand1 == 0 && operand2 == 0)
			{
				break;
			}
			
			print();
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public int calculate() {
		return operand1 + operand2;
	}

	public String getOperator() {
		return "+";
	}

	public void print() {
		String str = String.format("%d %s %d = %d", operand1, getOperator(), operand2, calculate());
		System.out.println(str);
	}

	public void input() {
		System.out.println("두 수를 입력하세요.");
		operand1 = scanner.nextInt();
		operand2 = scanner.nextInt();
	}

	public void makeScanner() {
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.execute();
	}
}
