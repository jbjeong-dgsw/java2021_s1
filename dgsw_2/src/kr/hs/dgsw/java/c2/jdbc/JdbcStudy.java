package kr.hs.dgsw.java.c2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudy {

	private Connection getConnection() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mariadb://211.53.209.159/dgsw_java", "dgsw_student", "1234");
	}
	
	private NameCard makeNameCard(ResultSet rs) throws Exception {
		int id1 = rs.getInt("id");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("phone_number");
		String address = rs.getString("address");

		NameCard nameCard = new NameCard();
		nameCard.setId(id1);
		nameCard.setName(name);
		nameCard.setPhoneNumber(phoneNumber);
		nameCard.setAddress(address);
		
		return nameCard;
	}
	
	public NameCard get(int id) throws Exception {
		// 데이터베이스에 접속한다.
		Connection con = getConnection();

		// 데이터베이스에서 데이터를 읽어온다.
		String sql = "SELECT * FROM phone_book WHERE id = ? ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();

		// 읽어온 데이터를 NameCard object로 변환한다.
		NameCard nameCard = null;
		if (rs.next()) {
			nameCard = makeNameCard(rs);
		}
		rs.close();
		pstmt.close();

		// 데이터베이스와 접속을 종료한다.
		con.close();

		return nameCard;
	}

	public NameCard getByName(String name) throws Exception {

		// 데이터베이스에 접속한다.
		Connection con = getConnection();

		// 데이터베이스에서 데이터를 읽어온다.
		String sql = "SELECT * FROM phone_book WHERE name = ? ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		
		ResultSet rs = pstmt.executeQuery();

		// 읽어온 데이터를 NameCard object로 변환한다.
		NameCard nameCard = null;
		if (rs.next()) {
			nameCard = makeNameCard(rs);
		}
		rs.close();
		pstmt.close();

		// 데이터베이스와 접속을 종료한다.
		con.close();

		return nameCard;
	}

	public List<NameCard> getList() throws Exception {
		// 데이터베이스에 접속한다.
		Connection con = getConnection();

		// 데이터베이스에서 데이터를 읽어온다.
		String sql = "SELECT * FROM phone_book ORDER BY id ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		// 읽어온 데이터를 NameCard object로 변환한다.
		List<NameCard> list = new ArrayList<NameCard>();
		NameCard nameCard = null;
		while (rs.next()) {
			nameCard = makeNameCard(rs);

			list.add(nameCard);
		}
		rs.close();
		pstmt.close();

		// 데이터베이스와 접속을 종료한다.
		con.close();

		return list;
	}

	public void insert(String name, String phoneNumber, 
			String address) throws Exception {
		// 데이터베이스에 접속한다.
		Connection con = getConnection();
		
		// 데이터베이스에 자료를 추가한다.
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO phone_book ");
		sql.append("  (name, phone_number, address) ");
		sql.append("VALUES ");
		sql.append("  (?, ?, ?) ");
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, name);
		pstmt.setString(2, phoneNumber);
		pstmt.setString(3, address);
		
		pstmt.executeUpdate();
		pstmt.close();
		
		// 데이터베이스와 접속을 종료한다
		con.close();
	}
	
	public static void main(String[] args) {
		try {
			JdbcStudy study = new JdbcStudy();
			List<NameCard> list = study.getList();

			for (NameCard card : list) {
				System.out.println(
						card.getId() + "  " + card.getName() + "  " + card.getPhoneNumber() + "  " + card.getAddress());
			}
			
			study.insert("이름", "02-1234-5678", "서울시 도봉구 쌍문동");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
