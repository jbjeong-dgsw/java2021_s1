package kr.hs.dgsw.java.c1.variable;

public class VariableLab {

	int intValue;
	
	static String strValue;
	
	static final int SIZE = 4;
	
	public static void main(String[] args) {
		
		VariableLab lab1 = new VariableLab();
		VariableLab lab2 = new VariableLab();
		
		lab1.intValue = 5;
		lab2.intValue = 10;
		
		System.out.println(lab1.intValue + "  " + lab2.intValue);
		
		VariableLab.strValue = "Hello";
		lab2.strValue = "World";
		
		System.out.println(lab1.strValue + "  " + lab2.strValue);
	}
}
