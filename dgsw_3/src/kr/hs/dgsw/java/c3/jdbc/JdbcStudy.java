package kr.hs.dgsw.java.c3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStudy {

	private Connection getConnection() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:mariadb://211.53.209.159/dgsw_java", 
						"dgsw_student",
						"1234");
		
		return connection;
	}
	
	public void readList() throws Exception {
		// �����ͺ��̽��� �����Ѵ�.
		Connection connection = getConnection();

		// �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book ";
		PreparedStatement pstmt = connection.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		// �о�� �����͸� ����Ѵ�.
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String phoneNumber = rs.getString("phone_number");
			String address = rs.getString("address");

			String str = String.format("%d : %s %s %s", id, name, phoneNumber, address);
			System.out.println(str);
		}
		rs.close();
		pstmt.close();

		// ������ �����Ѵ�.
		connection.close();

	}
	
	public void register(NameCard nameCard) 
			throws Exception {
		Connection connection = getConnection();
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO phone_book ");
		sql.append("  (name, phone_number, address) ");
		sql.append("VALUES ");
		sql.append("  (?, ?, ?) ");
		
		PreparedStatement pstmt = 
				connection.prepareStatement(sql.toString());
		pstmt.setString(1, nameCard.getName());
		pstmt.setString(2, nameCard.getPhoneNumber());
		pstmt.setString(3, nameCard.getAddress());
		
		pstmt.executeUpdate();
		pstmt.close();
		
		connection.close();
	}

	public void update(NameCard nameCard) 
			throws Exception {
		Connection connection = getConnection();
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE phone_book SET ");
		sql.append("  name = ?, ");
		sql.append("  phone_number = ?, ");
		sql.append("  address = ? ");
		sql.append(" WHERE id = ? ");
		
		PreparedStatement pstmt = 
				connection.prepareStatement(sql.toString());
		pstmt.setString(1, nameCard.getName());
		pstmt.setString(2, nameCard.getPhoneNumber());
		pstmt.setString(3, nameCard.getAddress());
		pstmt.setInt(4, nameCard.getId());
		
		pstmt.executeUpdate();
		pstmt.close();
		
		connection.close();
	}
	public NameCard read(int id) throws Exception {

		// �����ͺ��̽��� �����Ѵ�.
		Connection connection = getConnection();

		// �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book WHERE id = ? ";
		PreparedStatement pstmt = 
				connection.prepareStatement(sql);
		pstmt.setInt(1, id);

		ResultSet rs = pstmt.executeQuery();

		// �о�� �����͸� ����Ѵ�.
		NameCard nameCard = null;
		while (rs.next()) {
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String phoneNumber = rs.getString("phone_number");
			String address = rs.getString("address");

			nameCard = new NameCard();
			
			nameCard.setId(id1);
			nameCard.setName(name);
			nameCard.setAddress(address);
			nameCard.setPhoneNumber(phoneNumber);
		}
		rs.close();
		pstmt.close();

		// ������ �����Ѵ�.
		connection.close();

		return nameCard;
	}

	public static void main(String[] args) {

		try {

			JdbcStudy study = new JdbcStudy();
			//study.readList();
			
			NameCard card = new NameCard();
			card.setName("������");
			card.setPhoneNumber("010-9876-9876");
			card.setAddress("�뱸�� ����");
			
			study.register(card);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
