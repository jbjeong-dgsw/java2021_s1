package kr.hs.dgsw.java.c1.if1;

public class Sparrow extends Animal implements Sound, Fly {

	public Sparrow() {
		setName("Âü»õ");
		setFood("¾¾¾Ñ");
	}
	
	@Override
	public void live() {
		super.live();
		fly();
		makeSound();
	}
	
	
	@Override
	public void fly() {
		System.out.println("ÇÏ´ÃÀ» ³¯¾Æ ´Ù´Õ´Ï´Ù.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Â±Â±");
	}

	public static void main(String[] args) {
		Sparrow pigeon = new Sparrow();
		pigeon.live();
	}
}
