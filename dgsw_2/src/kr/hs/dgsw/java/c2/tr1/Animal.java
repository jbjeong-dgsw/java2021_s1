package kr.hs.dgsw.java.c2.tr1;

public abstract class Animal {

	public String getName() {
		return "µ¿¹°";
	}
	
	public abstract int getCountOfLegs();
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.getName();
		animal.getCountOfLegs();
	}
	
}
