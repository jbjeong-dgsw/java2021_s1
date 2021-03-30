package kr.hs.dgsw.java.c1.inherit;

public class Subtractor extends Adder {
	
	@Override
	public int calculate() {
		return operand1 - operand2;
	}
	
	@Override
	public String getOperator() {
		return "-";
	}
}
