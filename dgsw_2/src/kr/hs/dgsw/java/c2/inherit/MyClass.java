package kr.hs.dgsw.java.c2.inherit;

public class MyClass {

	@Override
	public String toString() {
		return "�� Ŭ���� " + super.toString();
	}
	
	public static void main(String[] args) {
		
		String a = "hello";
		
		MyClass myClass = new MyClass();
		System.out.println(myClass.toString());
		
	}
	
}
