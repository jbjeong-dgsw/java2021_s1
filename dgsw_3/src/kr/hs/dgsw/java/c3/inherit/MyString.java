package kr.hs.dgsw.java.c3.inherit;

public class MyString {
	public static void main(String[] args) {
		String str = "hello    world    world    ";
		String str2 = "ab";
		
		System.out.println("문자의 개수 : " + str.length());
		System.out.println("world : " + str.indexOf("world"));
		System.out.println("world : " + str.indexOf("world", 7));
		System.out.println("korea : " + str.indexOf("korea"));
		System.out.println("charAt : " + str.charAt(4));
		System.out.println(str.compareTo(str2));
		System.out.println("|" + str.trim() + "|");
	}
}
