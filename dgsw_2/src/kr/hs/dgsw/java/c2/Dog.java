package kr.hs.dgsw.java.c2;

public class Dog {

	String gender;
	String name;
	int age;
	
	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}
	
	public void bark() {
		
	}
	
	public void run() {
		
	}
	
	public void eat(String food) {
		System.out.println(name + "�� " + food + "�� �Խ��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		Dog mesi = new Dog();
		Dog snoopy = new Dog();
		//Dog nardo = new Dog("ȣ����");
		
		mesi.name = "�޽�";
		mesi.age = 3;
		mesi.gender = "F";
		
		snoopy.name = "������";
		snoopy.age = 10;
		snoopy.gender = "M";
		
		mesi.eat("���");
		snoopy.eat("���");
		//nardo.eat("��");
	}
}
