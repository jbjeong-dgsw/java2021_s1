package kr.hs.dgsw.java.c2.inherit;

public class Mammal extends Animal {

	public void birthBaby() {
		System.out.println(getName() + 
				"이(가) 새끼를 놓는다.");
	}
	
	public void eat() {
		System.out.println(getName() + 
				"이(가) 아기 때에는 젖을 먹습니다.");
		super.eat();
	}
	
	public static void main(String[] args) {
		Mammal hippo = new Mammal();
		hippo.setName("하마");
		hippo.setFood("물");
		
		hippo.eat();
		hippo.birthBaby();
		
		Animal dog = new Mammal();
		//dog.birthBaby();
		dog.eat();
		
	}
	
}
