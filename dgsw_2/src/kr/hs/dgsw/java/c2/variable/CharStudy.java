package kr.hs.dgsw.java.c2.variable;

public class CharStudy {
	public static void main(String[] args) {

		char a = 66;
		char b = 'a';
		int c = b + 0;
		char d = '��';
		
		System.out.println(a);
		System.out.println(b + "  " + c);
		System.out.println(d + "  " + ((int)d));
		
		for (char i = '��' ;  i < '��' ; i++) {
			System.out.println(i + "  " + (int)i);
		}
		
		System.out.println("�����Ǵ� �ѱ��� ���� : " +
				('�R' - '��' + 1));
		
		char hanja = '��';
		System.out.println(hanja  + "  " + (int)hanja);
		
		
	}
}
