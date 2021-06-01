package kr.hs.dgsw.java.c2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStudy {

	public NameCard get(int id) throws Exception {
		// �����ͺ��̽��� �����Ѵ�.
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mariadb://211.53.209.159/dgsw_java", 
				"dgsw_student", 
				"1234");
		
		// �����ͺ��̽����� �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book WHERE id = " + id;
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		// �о�� �����͸� NameCard object�� ��ȯ�Ѵ�.
		NameCard nameCard = null;
		if (rs.next()) {
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String phoneNumber = rs.getString("phone_number");
			String address = rs.getString("address");
			
			nameCard = new NameCard();
			nameCard.setId(id1);
			nameCard.setName(name);
			nameCard.setPhoneNumber(phoneNumber);
			nameCard.setAddress(address);
		}
		rs.close();
		pstmt.close();
		
		// �����ͺ��̽��� ������ �����Ѵ�.
		con.close();
		
		return nameCard;
	}
	
	public static void main(String[] args) {
		try {
			JdbcStudy study = new JdbcStudy();
			NameCard card = study.get(1);
			
			if (card != null) {
				System.out.println(card.getId() + "  " + 
						card.getName() + "  " + 
						card.getPhoneNumber() + "  " + 
						card.getAddress());
			} else {
				System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
