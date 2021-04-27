package kr.hs.dgsw.java.c1.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

	private Map<String, NameCard> map = 
			new HashMap<String, NameCard>();
	

	public NameCard read(String name) {
		return map.get(name);
	}
	
	public void save(String name, String phone) {
		NameCard card = new NameCard();
		card.setName(name);
		card.setPhone(phone);
		
		save(card);
	}

	public void save(NameCard card) {
		map.put(card.getName(), card);
	}

	public NameCard readByPhone(String phone) {
		Collection<NameCard> list =
				map.values();
		
		for (NameCard card : list) {
			if (card.getPhone().equals(phone)) {
				return card;
			}
		}
		
		return null;
	}
	
	public int getSize() {
		return map.size();
	}
	
	public void printAll() {
		Collection<NameCard> list =
				map.values();
		
		for (NameCard card : list) {
			System.out.println(card.getName() + " - " + card.getPhone());
		}
	}
	
}
