package kr.hs.dgsw.java.c1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStudy {

	public static void main(String[] args) {
		
		try {
			// �����ͺ��̽��� �����Ѵ�.
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection(
							"jdbc:mariadb://211.53.209.159/dgsw_java", 
							"dgsw_student", 
							"1234");
			
			// �����͸� �о�´�.
			String sql = "SELECT * FROM phone_book WHERE name = ? ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "������");
			
			ResultSet rs = pstmt.executeQuery();
			
			// �о�� �����͸� ����Ѵ�.
			while (rs.next()) {
				String name = rs.getString("name");
				String phoneNumber = rs.getString("phone_number");
				String address = rs.getString("address");
				int id = rs.getInt("id");
				
				System.out.println(id + " : " + 
						name + "  " + phoneNumber + "  " + 
						address);
			}
			rs.close();
			pstmt.close();
			
			// �����ͺ��̽��� ������ ���´�.
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
