package kr.hs.dgsw.java.c3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStudy {

	public void readList() throws Exception {
		// 데이터베이스에 접속한다.
		Class.forName("org.mariadb.jdbc.Driver");
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:mariadb://211.53.209.159/dgsw_java", 
						"dgsw_student", 
						"1234");
		
		// 데이터를 읽어온다.
		String sql = "SELECT * FROM phone_book ";
		PreparedStatement pstmt = 
				connection.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		// 읽어온 데이터를 출력한다.
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
		
		// 접속을 종료한다.
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
