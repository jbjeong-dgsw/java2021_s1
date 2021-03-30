package kr.hs.dgsw.java.c3.inherit;

public class Mammal extends Animal {

	public void nurseBaby() {
		System.out.println(getName() + 
				"은(는) 새끼에게 젖을 먹인다.");
	}
	
	public void eat() {
		System.out.println(getName() + 
				"은(는) 태어나서 젖을 먹는다.");
		System.out.println(getName() + "이(가) " + 
				getFood() + "을(를) 먹는다.");
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		human.setName("사람");
		human.setFood("꿈");
		
		human.eat();
		human.nurseBaby();
		
		Animal dog = new Mammal();
		dog.setName("강아지");
		dog.setFood("사료");
		
		//dog.nurseBaby();
		dog.eat();
	}
	
}
