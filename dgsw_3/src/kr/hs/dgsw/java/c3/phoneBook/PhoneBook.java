package kr.hs.dgsw.java.c3.phoneBook;

import java.util.List;

public interface PhoneBook {

	/**
	 * ��ϵ� �ּҷ��� ��� �о�´�.
	 * @return
	 */
	public List<NameCard> getList();
	
	/**
	 * �־��� ���̵� ���� �ּҷ��� �о�´�.
	 * 
	 * @param id
	 * @return
	 */
	public NameCard getCard(int id);

	/**
	 * �־��� �̸��� ���� �ּҷ��� �о�´�
	 * 
	 * @param name
	 * @return
	 */
	public NameCard getCard(String name);
	
	/**
	 * �ּҷϿ� �־��� �����͸� �߰��Ѵ�.
	 * 
	 * @param name
	 * @param phoneNumber
	 * @param address
	 * @return
	 */
	public int addCard(String name, String phoneNumber, String address);
	
	/**
	 * �־��� ���̵� ���� �ּҸ� �����Ѵ�.
	 * 
	 * @param id
	 * @return
	 */
	public boolean removeCard(int id);
	
	/**
	 * �ּҷ� �����͸� �����Ѵ�.
	 * 
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param address
	 */
	public void updateCard(int id, String name, String phoneNumber, String address);
	
	/**
	 * ��ϵ� �ּ��� ������ �ǵ�����.
	 * 
	 * @return
	 */
	public int size();
	
}
