package kr.hs.dgsw.java.c3.tr1;

public abstract class Animal {

	public abstract int getCountOfLegs();
	
	public void print() {
		System.out.println(getCountOfLegs());
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.print();
	}
	
}
