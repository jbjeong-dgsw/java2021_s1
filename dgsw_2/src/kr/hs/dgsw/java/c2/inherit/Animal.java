package kr.hs.dgsw.java.c2.inherit;

public class Animal {
	protected String name;
	private String food;
	
	public void eat() {
		System.out.println(name + "��(��) " + 
				food + "��(��) �Դ´�.");
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
		Animal cat = new Animal();
		cat.setName("�����");
		cat.setFood("���");
	}
}
