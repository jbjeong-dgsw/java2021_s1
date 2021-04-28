package kr.hs.dgsw.java.c2.api;

import java.util.Date;

public class GenericStudy {

	public static void main(String[] args) {
		
		MyClass<Integer, String> class1 = 
				new MyClass<Integer, String>();
		
		MyClass<String, Date> class2 = 
				new MyClass<String, Date>();
		
	}
	
}
