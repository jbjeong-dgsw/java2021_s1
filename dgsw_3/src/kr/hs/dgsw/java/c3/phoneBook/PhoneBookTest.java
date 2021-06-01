package kr.hs.dgsw.java.c3.phoneBook;

import java.util.List;

public class PhoneBookTest {

	public static void main(String[] args) {
		
		PhoneBook phoneBook = new FilePhoneBook();
		NameCard nameCard = null;
		
		// 네 개의 데이터를 추가하세요.
		phoneBook.addCard("정재봉", "010-3458-4250", "대구시 동구");
		phoneBook.addCard("유재석", "010-1234-5678", "서울시 강남구");
		phoneBook.addCard("손흥민", "010-0000-0000", "런던시 토튼햄구");
		phoneBook.addCard("윤여정", "010-9876-5432", "아카데미 시상식장");
		
		// 등록된 모든 연락처를 읽어와 상세 정보를 출력하세요.
		List<NameCard> cards = phoneBook.getList();
		System.out.println("getList() --------------------");
		for (NameCard card : cards) {
			System.out.println(card.toString());
		}
		
		// getName(int) 메소드를 이용해서 연락처 하나를 읽어와 상세 정보를 출력하세요.
		nameCard = phoneBook.getCard(cards.get(1).getId());
		System.out.println("getCard(int) --------------------");
		System.out.println(nameCard.toString());
		
		// getName(String) 메소드를 이용해서 연락처 하나를 읽어와 상세 정보를 출력하세요.
		nameCard = phoneBook.getCard(cards.get(2).getName());
		System.out.println("getCard(String) --------------------");
		System.out.println(nameCard.toString());
		
		// 세번째로 등록된 연락처를 삭제하세요.
		phoneBook.removeCard(cards.get(2).getId());
		System.out.println("removeCard() --------------------");
		System.out.println("size : " + phoneBook.size());
		
		// 두번째로 등록된 연락처의 정보를 임의로 변경하세요.
		phoneBook.updateCard(cards.get(1).getId(), "유산슬", "010-5555-6666", "합정역 5번 출구");
		System.out.println("updateCard() --------------------");
		nameCard = phoneBook.getCard(cards.get(1).getId());
		System.out.println(nameCard.toString());
	}
	
}
