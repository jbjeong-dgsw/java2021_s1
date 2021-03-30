package kr.hs.dgsw.java.c1.inherit;

public class Animal {
	private String name;
	private String food;
	
	public void eat() {
		System.out.println(name + "이(가) " + 
				food + "을(를) 먹는다.");
	}
	
	public String getName() {
		return name;
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
		Animal cat = new Animal();
		
		cat.name = "고양이";
		
		lion.setName("사자");
		lion.setFood("고기");
		
		hippo.setName("하마");
		hippo.setFood("풀");
		
		lion.eat();
	}
}
