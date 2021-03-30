package kr.hs.dgsw.java.c3.inherit;

import java.util.Scanner;

public class Adder {
	protected int operand1;
	protected int operand2;
	protected Scanner scanner;

	public void execute() {
		makeScanner();
		
		while (true) {
			inputNumbers();
			
			// ���� �� ���� 0�̶�� ������
			if (checkTerminate()) 
			{
				break;
			}
			
			print();
		}

		closeScanner();

		System.out.println("���α׷� ����");
	}
	
	public int calculate() {
		return operand1 + operand2;
	}

	public String getOperator() {
		return "+";
	}
	
	public void print() {
		String str = String.format("%d %s %d = %d", 
				operand1, getOperator(), operand2, 
				calculate());
		System.out.println(str);
	}

	protected void makeScanner() {
		scanner = new Scanner(System.in); 
	}
	
	protected void closeScanner() {
		scanner.close();
	}
	
	protected void inputNumbers() {
		System.out.println("�� ������ �Է��ϼ���.");
		operand1 = scanner.nextInt();
		operand2 = scanner.nextInt();
	}
	
	protected boolean checkTerminate() {
		return ((0 == operand1) && (0 == operand2));
	}
	
	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.execute();
	}
}
