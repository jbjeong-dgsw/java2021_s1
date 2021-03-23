package kr.hs.dgsw.java.c3.variable;

public class CharStudy {
	public static void main(String[] args) {
		
		char a = 65;
		char b = 'A';
		char c = 'a';
		int d = 'A';
		char e = '°¡';
		char f = 'Ê«';
		
		System.out.println(a);
		System.out.println(b + 0);
		System.out.println(c + 0);
		System.out.println(d);
		System.out.println(e + 0);
		System.out.println(f + 0);
		
		System.out.println('ÆR' - '°¡' + 1);
		
		/*
		for (char i = '°¡' ; i < '³ª' ; i++) {
			System.out.println(i);
		}
		*/
	}
}
