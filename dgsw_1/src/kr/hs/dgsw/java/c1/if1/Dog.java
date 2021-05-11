package kr.hs.dgsw.java.c1.if1;

public class Dog extends Animal implements Sound {

	public Dog() {
		setName("°³");
		setFood("»ç·á");
	}
	
	@Override
	public void makeSound() {
		System.out.println("¸Û¸Û");
	}

}
