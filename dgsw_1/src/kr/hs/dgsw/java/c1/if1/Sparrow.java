package kr.hs.dgsw.java.c1.if1;

public class Sparrow extends Animal implements Sound, Fly {

	public Sparrow() {
		setName("����");
		setFood("����");
	}
	
	@Override
	public void live() {
		super.live();
		fly();
		makeSound();
	}
	
	
	@Override
	public void fly() {
		System.out.println("�ϴ��� ���� �ٴմϴ�.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("±±");
	}

	public static void main(String[] args) {
		Sparrow pigeon = new Sparrow();
		pigeon.live();
	}
}
