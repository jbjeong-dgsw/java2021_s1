package kr.hs.dgsw.java.c3.inherit;

public class Subtractor extends Adder {

	public int calculate() {
		return operand1 - operand2;
	}
	
	public String getOperator() {
		return "-";
	}

	public static void main(String[] args) {
		Subtractor subtractor = new Subtractor();
		subtractor.execute();
		
	}
}
