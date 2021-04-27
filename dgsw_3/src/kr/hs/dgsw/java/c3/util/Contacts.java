package kr.hs.dgsw.java.c3.util;

import java.util.HashMap;
import java.util.Map;

public class Contacts {

	private Map<String, NameCard> map = 
			new HashMap<String, NameCard>();

	public void add(NameCard card) {
		map.put(card.getName(), card);
	}
	
	public NameCard read(String name) {
		return map.get(name);
	}
	
	public void remove(String name) {
		map.remove(name);
	}
	
	public NameCard readByPhone(String phone) {
		return null;
	}
	
	public static void main(String[] args) {
		
		Contacts contacts = new Contacts();
		
		NameCard card = new NameCard();
		card.setName("Á¤ÀçºÀ");
		card.setPhone("010-3458-4250");
		
		contacts.add(card);
		
		NameCard saved = contacts.read("Á¤ÀçºÀ");
		
		contacts.read("Á¤ÀçºÀ");
		
	}
}
