package kr.hs.dgsw.java.c1.inherit;

public class Mammal extends Animal {

	public void nurseBaby() {
		System.out.println("�������� ���� ���δ�.");
	}
	
	@Override
	public void eat() {
		System.out.println("�ֱ�� ���� �Դ´�.");
		super.eat();
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		Animal dog = new Mammal();
		
		//Mammal mouse = new Animal();
		//Bird hen = new Mammel();
		
		human.setName("���");
		human.setFood("�̰� ����");

		human.eat();

		dog.setName("������");
		dog.setFood("���");
		
		//dog.nurseBaby();
		dog.eat();
		
		//dog.eat();
		
	}
	
}
