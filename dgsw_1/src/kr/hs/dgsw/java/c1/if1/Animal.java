package kr.hs.dgsw.java.c1.if1;

public class Animal {

	private String name;
	
	private String food;
	
	public void live() {
		eat();
	}
	
	public void eat() {
		System.out.println(name + "��(��) " + food + "��(��) �Խ��ϴ�.");
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
}
