package kr.hs.dgsw.java.c1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcStudy2 {

	public void register(String name, String phoneNumber, 
			String address) {
		
		try {
			// ����
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection(
							"jdbc:mariadb://211.53.209.159/dgsw_java", 
							"dgsw_student", "1234");
			
			// ������ ����
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO phone_book ");
			sql.append("  (name, phone_number, address) ");
			sql.append("VALUES ");
			sql.append("  (?, ?, ?) ");
			
			PreparedStatement pstmt = 
					con.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			
			pstmt.executeUpdate();
			pstmt.close();
			
			// ���� ����
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
