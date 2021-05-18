package kr.hs.dgsw.java.c3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStudy {

	public void readList() throws Exception {
		// �����ͺ��̽��� �����Ѵ�.
		Class.forName("org.mariadb.jdbc.Driver");
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:mariadb://211.53.209.159/dgsw_java", 
						"dgsw_student", 
						"1234");
		
		// �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book ";
		PreparedStatement pstmt = 
				connection.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		// �о�� �����͸� ����Ѵ�.
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String phoneNumber = rs.getString("phone_number");
			String address = rs.getString("address");
			
			String str = String.format(
					"%d : %s %s %s", 
					id, name, phoneNumber, address);
			System.out.println(str);
		}
		rs.close();
		pstmt.close();
		
		// ������ �����Ѵ�.
		connection.close();
		
	}
	
	public NameCard read(int id) {
		
		return null;
	}
	
	public static void main(String[] args) {
		
		try {
			
			JdbcStudy study = new JdbcStudy();
			study.readList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
