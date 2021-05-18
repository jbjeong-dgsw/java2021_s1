package kr.hs.dgsw.java.c1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcStudy2 {

	public void register(String name, String phoneNumber, 
			String address) {
		
		try {
			// 접속
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection(
							"jdbc:mariadb://211.53.209.159/dgsw_java", 
							"dgsw_student", "1234");
			
			// 데이터 쓴다
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
			
			// 접속 종료
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scanner.next();
		
		System.out.print("전화번호 : ");
		String phoneNumber = scanner.next();

		System.out.print("주소 : ");
		String address = scanner.next();

		scanner.close();
		
		JdbcStudy2 study = new JdbcStudy2();
		study.register(name, phoneNumber, address);
		
	}
	
}
