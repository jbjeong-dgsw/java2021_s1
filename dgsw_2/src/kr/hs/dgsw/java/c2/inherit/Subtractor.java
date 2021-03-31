package kr.hs.dgsw.java.c2.inherit;

public class Subtractor extends Adder {
	
	@Override
	public int calculate() {
		return getOperand1() - getOperand2();
	}

	@Override
	public String getOperator() {
		return "-";
	}
	
	public static void main(String[] args) {
		Subtractor subtractor = new Subtractor();
		subtractor.execute();
	}
}
