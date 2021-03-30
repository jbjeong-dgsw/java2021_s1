package kr.hs.dgsw.java.c1.inherit;

public class Mammal extends Animal {

	public void nurseBaby() {
		System.out.println("새끼에게 젖을 먹인다.");
	}
	
	@Override
	public void eat() {
		System.out.println("애기는 젖을 먹는다.");
		super.eat();
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		Animal dog = new Mammal();
		
		//Mammal mouse = new Animal();
		//Bird hen = new Mammel();
		
		human.setName("사람");
		human.setFood("이것 저것");

		human.eat();

		dog.setName("강아지");
		dog.setFood("사료");
		
		//dog.nurseBaby();
		dog.eat();
		
		//dog.eat();
		
	}
	
}
