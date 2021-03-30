package kr.hs.dgsw.java.c3.inherit;

public class Adder {
	protected int operand1;
	protected int operand2;

	public void execute() {
		// TODO
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
