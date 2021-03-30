package kr.hs.dgsw.java.c1.inherit;

public class Animal {
	private String name;
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
		Animal lion = new Animal();
		Animal hippo = new Animal();
		Animal cat = new Animal();
		
		cat.name = "�����";
		
		lion.setName("����");
		lion.setFood("���");
		
		hippo.setName("�ϸ�");
		hippo.setFood("Ǯ");
		
		lion.eat();
	}
}
