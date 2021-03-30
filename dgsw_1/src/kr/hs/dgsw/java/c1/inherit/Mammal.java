package kr.hs.dgsw.java.c1.inherit;

public class Mammal extends Animal {

	public void nurseBaby() {
		System.out.println("새끼에게 젖을 먹인다.");
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		
		human.setName("사람");
		human.setFood("이것 저것");

		human.eat();
		human.nurseBaby();
	}
	
}
