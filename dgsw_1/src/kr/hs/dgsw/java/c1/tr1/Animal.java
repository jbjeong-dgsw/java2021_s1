package kr.hs.dgsw.java.c1.tr1;

public abstract class Animal {

	public abstract String getName();
	
	public abstract int getCountOfLegs();
	
	public void print() {
		System.out.println(getName() + "  " + getCountOfLegs());
	}
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.print();
		dog.print();
	}
	
}
