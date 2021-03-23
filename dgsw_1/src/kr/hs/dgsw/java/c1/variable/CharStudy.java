package kr.hs.dgsw.java.c1.variable;

public class CharStudy {
	public static void main(String[] args) {

		char a = 65;
		char ba = '가';
		char bb = '나';
		
		System.out.println(a);
		System.out.println(bb - ba);
		
		/*
		for (char i = '가' ; i <= '나' ; i++) {
			System.out.println(i);
		}
		*/
		
		int count = '힣' - '가' + 1;
		System.out.println("count of 한글 : " + count);
		
		char dae = '大';
		System.out.println("큰 대 : " + (dae + 0));
	}
}
