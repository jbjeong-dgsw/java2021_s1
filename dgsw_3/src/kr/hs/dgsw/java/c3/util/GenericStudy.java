package kr.hs.dgsw.java.c3.util;

import java.util.Date;

public class GenericStudy {

	public static void main(String[] args) {
		
		MyClass<String> class1 = new MyClass<String>();
		MyClass<Date> class2 = new MyClass<Date>();
		MyClass<Integer> class3 = new MyClass<Integer>();
	}
	
}
