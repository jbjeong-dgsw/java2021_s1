package kr.hs.dgsw.java.c3.variable;

public class VariableStudy {

	static final int SIZE = 3;

	int age;

	public void method(String nickname) {
		String name = null;

		if (null == name) {
			int height = 182;
		} else {
			int height = 178;
		}

		int height = 160;
		
		System.out.println(height);
	}

	public static void main(String[] args) {
		VariableStudy study1 = new VariableStudy();
		VariableStudy study2 = new VariableStudy();

		//VariableStudy.age = 12;
		//VariableStudy.age = 18;

		//System.out.println(VariableStudy.age);
	}
}
