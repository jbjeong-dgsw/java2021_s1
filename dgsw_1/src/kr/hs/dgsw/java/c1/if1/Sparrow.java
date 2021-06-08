package kr.hs.dgsw.java.c1.if1;

public class Sparrow implements Bird {

	@Override
	public void eat() {
		System.out.println("참새가 좁쌀을 먹습니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("참새가 날아갑니다.");
	}
	
}
