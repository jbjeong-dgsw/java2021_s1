package kr.hs.dgsw.java.c1.tr1;

public class Cat extends Animal {

	@Override
	public String getName() {
		return "°í¾çÀÌ";
	}
	
	@Override
	public int getCountOfLegs() {
		return 4;
	}
	
	public static void main(String[] args) {
		
		Animal cat = new Cat();
		System.out.println(cat.getName());
		
	}
	
}
