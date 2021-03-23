package kr.hs.dgsw.java.c1.variable;

public class Local {
	
	public void method1() {
		int localVariable = 0;

		int a = 7;
		if (0 == localVariable) {
			int a = 3;
		} 
		else {
			int a = 5;
		}
		
		System.out.println(a);
	}
	
	public void method2() {
		int localVariable;
	}
}
