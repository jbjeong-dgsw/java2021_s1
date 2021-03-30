package kr.hs.dgsw.java.c1.inherit;

public class Adder {
	protected int operand1;
	protected int operand2;

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
	
	public void print()
	{
		String str = String.format("%d %s %d = %d", 
				operand1, getOperator(), operand2, 
				calculate());
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.setOperand1(1239);
		adder.setOperand2(5321);
		adder.print();
	}
}
