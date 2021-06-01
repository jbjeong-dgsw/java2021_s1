package kr.hs.dgsw.java.c3.phoneBook;

import java.util.List;

public class PhoneBookTest {

	public static void main(String[] args) {
		
		PhoneBook phoneBook = new FilePhoneBook();
		NameCard nameCard = null;
		
		// �� ���� �����͸� �߰��ϼ���.
		phoneBook.addCard("�����", "010-3458-4250", "�뱸�� ����");
		phoneBook.addCard("���缮", "010-1234-5678", "����� ������");
		phoneBook.addCard("�����", "010-0000-0000", "������ ��ư�ܱ�");
		phoneBook.addCard("������", "010-9876-5432", "��ī���� �û����");
		
		// ��ϵ� ��� ����ó�� �о�� �� ������ ����ϼ���.
		List<NameCard> cards = phoneBook.getList();
		System.out.println("getList() --------------------");
		for (NameCard card : cards) {
			System.out.println(card.toString());
		}
		
		// getName(int) �޼ҵ带 �̿��ؼ� ����ó �ϳ��� �о�� �� ������ ����ϼ���.
		nameCard = phoneBook.getCard(cards.get(1).getId());
		System.out.println("getCard(int) --------------------");
		System.out.println(nameCard.toString());
		
		// getName(String) �޼ҵ带 �̿��ؼ� ����ó �ϳ��� �о�� �� ������ ����ϼ���.
		nameCard = phoneBook.getCard(cards.get(2).getName());
		System.out.println("getCard(String) --------------------");
		System.out.println(nameCard.toString());
		
		// ����°�� ��ϵ� ����ó�� �����ϼ���.
		phoneBook.removeCard(cards.get(2).getId());
		System.out.println("removeCard() --------------------");
		System.out.println("size : " + phoneBook.size());
		
		// �ι�°�� ��ϵ� ����ó�� ������ ���Ƿ� �����ϼ���.
		phoneBook.updateCard(cards.get(1).getId(), "���꽽", "010-5555-6666", "������ 5�� �ⱸ");
		System.out.println("updateCard() --------------------");
		nameCard = phoneBook.getCard(cards.get(1).getId());
		System.out.println(nameCard.toString());
	}
	
}
