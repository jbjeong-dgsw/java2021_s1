package kr.hs.dgsw.java.c3.inherit;

public class Mammal extends Animal {

	public void nurseBaby() {
		System.out.println(getName() + 
				"��(��) �������� ���� ���δ�.");
	}
	
	public void eat() {
		System.out.println(getName() + 
				"��(��) �¾�� ���� �Դ´�.");
		System.out.println(getName() + "��(��) " + 
				getFood() + "��(��) �Դ´�.");
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		human.setName("���");
		human.setFood("��");
		
		human.eat();
		human.nurseBaby();
		
		Animal dog = new Mammal();
		dog.setName("������");
		dog.setFood("���");
		
		//dog.nurseBaby();
		dog.eat();
	}
	
}
