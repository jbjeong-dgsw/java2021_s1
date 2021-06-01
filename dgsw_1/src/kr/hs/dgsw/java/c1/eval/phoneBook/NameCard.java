package kr.hs.dgsw.java.c1.eval.phoneBook;

public class NameCard {
	/**
	 * 아이디
	 */
	public int id;
	
	/**
	 * 성명
	 */
	public String name;
	
	/**
	 * 전화 번호
	 */
	public String phoneNumber;
	
	/**
	 * 주소
	 */
	public String address;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("{");
		buffer.append("'id' : " + id).append(", ");
		buffer.append("'name' : '" + name).append("', ");
		buffer.append("'phoneNumber' : '" + phoneNumber).append("', ");
		buffer.append("'address' : '" + address);
		buffer.append("}");
		
		return buffer.toString();
	}
}
