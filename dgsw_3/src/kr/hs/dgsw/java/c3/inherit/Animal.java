package kr.hs.dgsw.java.c3.inherit;

public class Animal {
	protected String name;
	private String food;

	public void eat() {
		System.out.println(name + "이(가) " + 
				food + "을(를) 먹는다.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public static void main(String[] args) {
		Animal lion = new Animal();
		Animal hippo = new Animal();
		
		lion.setName("사자");
		lion.setFood("고기");
		
		lion.name = "고양이";
		
		hippo.setName("하마");
		hippo.setFood("물");
		
		lion.eat();
		hippo.eat();
	}
}
