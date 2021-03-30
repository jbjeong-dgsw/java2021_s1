package kr.hs.dgsw.java.c3.inherit;

public class Birds extends Animal {
	private String sound;
	
	public void fly() {
		System.out.println(getName() + 
				"��(��) �ϴ��� ���ų�, �� ����.");
	}
	
	public void sing() {
		System.out.println(getName() + 
				"��(��) " + sound + " �뷡�Ѵ�.");
	}
	
	public static void main(String[] args) {
		Birds parrot = new Birds();
		parrot.setName("�޹���");
		parrot.sound = "�޹��޹�";
		
		parrot.sing();
	}
}
