package kr.hs.dgsw.java.c1.inherit;

public class Mammal extends Animal {

	public void nurseBaby() {
		System.out.println("�������� ���� ���δ�.");
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		
		human.setName("���");
		human.setFood("�̰� ����");

		human.eat();
		human.nurseBaby();
	}
	
}
