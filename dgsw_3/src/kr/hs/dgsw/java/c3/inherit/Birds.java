package kr.hs.dgsw.java.c3.inherit;

public class Birds extends Animal {
	private String sound;
	
	public void fly() {
		System.out.println(getName() + 
				"은(는) 하늘을 날거나, 못 난다.");
	}
	
	public void sing() {
		System.out.println(getName() + 
				"은(는) " + sound + " 노래한다.");
	}
	
	public static void main(String[] args) {
		Birds parrot = new Birds();
		parrot.setName("앵무새");
		parrot.sound = "앵무앵무";
		
		parrot.sing();
	}
}
