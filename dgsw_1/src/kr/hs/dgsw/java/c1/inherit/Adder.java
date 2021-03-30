package kr.hs.dgsw.java.c1.inherit;

public class Adder {
	private int operand1;
	private int operand2;

	public Adder(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public int calculate() {
		return operand1 + operand2;
	}
	
	public void print()
	{
		String str = String.format("%d + %d = %d", 
				operand1, operand2, calculate());
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Adder adder = new Adder(3421, 5849);
		adder.print();
	}
}
