package kr.hs.dgsw.java.c2.inherit;

public class Mammal extends Animal {

	public void birthBaby() {
		System.out.println(getName() + 
				"��(��) ������ ���´�.");
	}
	
	public void eat() {
		System.out.println(getName() + 
				"��(��) �Ʊ� ������ ���� �Խ��ϴ�.");
		super.eat();
	}
	
	public static void main(String[] args) {
		Mammal hippo = new Mammal();
		hippo.setName("�ϸ�");
		hippo.setFood("��");
		
		hippo.eat();
		hippo.birthBaby();
		
		Animal dog = new Mammal();
		//dog.birthBaby();
		dog.eat();
		
	}
	
}
