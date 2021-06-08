package kr.hs.dgsw.java.c3.phoneBook;

import java.util.List;

public interface PhoneBook {

	/**
	 * 등록된 주소록을 모두 읽어온다.
	 * @return
	 */
	public List<NameCard> getList();
	
	/**
	 * 주어진 아이디를 가진 주소록을 읽어온다.
	 * 
	 * @param id
	 * @return
	 */
	public NameCard getCard(int id);

	/**
	 * 주어진 이름을 가진 주소록을 읽어온다
	 * 
	 * @param name
	 * @return
	 */
	public NameCard getCard(String name);
	
	/**
	 * 주소록에 주어진 데이터를 추가한다.
	 * 
	 * @param name
	 * @param phoneNumber
	 * @param address
	 * @return
	 */
	public int addCard(String name, String phoneNumber, String address);
	
	/**
	 * 주어진 아이디를 가진 주소를 삭제한다.
	 * 
	 * @param id
	 * @return
	 */
	public boolean removeCard(int id);
	
	/**
	 * 주소록 데이터를 변경한다.
	 * 
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param address
	 */
	public void updateCard(int id, String name, String phoneNumber, String address);
	
	/**
	 * 등록된 주소의 개수를 되돌린다.
	 * 
	 * @return
	 */
	public int size();
	
}
