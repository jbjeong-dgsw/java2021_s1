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
		System.out.println(name + "가 " + food + "을 먹습니다.");
	}
	
	public static void main(String[] args) {
		
		Dog mesi = new Dog();
		Dog snoopy = new Dog();
		//Dog nardo = new Dog("호날두");
		
		mesi.name = "메시";
		mesi.age = 3;
		mesi.gender = "F";
		
		snoopy.name = "스누피";
		snoopy.age = 10;
		snoopy.gender = "M";
		
		mesi.eat("사료");
		snoopy.eat("고기");
		//nardo.eat("골");
	}
}
