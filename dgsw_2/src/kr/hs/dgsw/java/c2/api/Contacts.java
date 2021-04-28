package kr.hs.dgsw.java.c2.api;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

	private List<NameCard> list = 
			new ArrayList<NameCard>();
	
	public void add(NameCard card) {
		list.add(card);
	}
	
	public NameCard read(String name) {
		for (NameCard card: list) {
			if (card.getName().equals(name)) {
				return card;
			}
		}
		
		return null;
	}
	
	public NameCard readByPhoneNumber(String phoneNumber) {
		for (NameCard card: list) {
			if (card.getPhoneNumber().equals(phoneNumber)) {
				return card;
			}
		}
		
		return null;
	}
	
	public void remove(String name) {
		for (NameCard card: list) {
			if (card.getName().equals(name)) {
				list.remove(card);
			}
		}
	}
	
	public List<NameCard> getAll() {
		return list;
	}
	
	public static void main(String[] args) {
		
		Contacts contacts = new Contacts();
		
		NameCard card = new NameCard();
		card.setName("Á¤ÀçºÀ");
		card.setPhoneNumber("010-3458-4250");
		contacts.add(card);
		
		card = contacts.read("Á¤ÀçºÀ");
		card = contacts.readByPhoneNumber("010-3458-4250");
		
		contacts.read("Á¤ÀçºÀ");
		
		List<NameCard> cards = contacts.getAll();
	}
}
