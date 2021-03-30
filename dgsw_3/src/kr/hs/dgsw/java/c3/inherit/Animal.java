package kr.hs.dgsw.java.c3.inherit;

public class Animal {
	protected String name;
	private String food;

	public void eat() {
		System.out.println(name + "��(��) " + 
				food + "��(��) �Դ´�.");
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
		
		lion.setName("����");
		lion.setFood("���");
		
		lion.name = "�����";
		
		hippo.setName("�ϸ�");
		hippo.setFood("��");
		
		lion.eat();
		hippo.eat();
	}
}
