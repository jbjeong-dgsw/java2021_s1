package kr.hs.dgsw.java.c1.util;

import java.util.Date;

public class GenericStudy {

	public static void main(String[] args) {
		
		MyClass<String> myClass = new MyClass<String>();
		myClass.setValue("abcd");
		
		MyClass<Integer> myClass1 = new MyClass<Integer>();
		myClass1.setValue(3);
		
		MyClass<Date> myClass2 = new MyClass<Date>();
		myClass2.setValue(new Date());
	}
	
}
