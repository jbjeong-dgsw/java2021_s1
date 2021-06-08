package kr.hs.dgsw.java.c1.if1;

public class Doer {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.eat();
		
		Animal dog2 = new Dog(); 
		dog2.eat();
		
		Animal animal = new Dog();
		animal.eat();
		animal = new Cat();
		animal.eat();
		
		Sound dog3 = new Dog();
		
		dog1.makeSound();
		dog3.makeSound();
		
		Sparrow sparrow1 = new Sparrow();
		Bird sparrow2 = new Sparrow();
		Animal sparrow3 = new Sparrow();
		
		
	}
	
	
}
