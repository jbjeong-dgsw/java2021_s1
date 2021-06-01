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
		// �����ͺ��̽��� �����Ѵ�.
		Connection con = getConnection();

		// �����ͺ��̽����� �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book WHERE id = ? ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();

		// �о�� �����͸� NameCard object�� ��ȯ�Ѵ�.
		NameCard nameCard = null;
		if (rs.next()) {
			nameCard = makeNameCard(rs);
		}
		rs.close();
		pstmt.close();

		// �����ͺ��̽��� ������ �����Ѵ�.
		con.close();

		return nameCard;
	}

	public NameCard getByName(String name) throws Exception {

		// �����ͺ��̽��� �����Ѵ�.
		Connection con = getConnection();

		// �����ͺ��̽����� �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book WHERE name = ? ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		
		ResultSet rs = pstmt.executeQuery();

		// �о�� �����͸� NameCard object�� ��ȯ�Ѵ�.
		NameCard nameCard = null;
		if (rs.next()) {
			nameCard = makeNameCard(rs);
		}
		rs.close();
		pstmt.close();

		// �����ͺ��̽��� ������ �����Ѵ�.
		con.close();

		return nameCard;
	}

	public List<NameCard> getList() throws Exception {
		// �����ͺ��̽��� �����Ѵ�.
		Connection con = getConnection();

		// �����ͺ��̽����� �����͸� �о�´�.
		String sql = "SELECT * FROM phone_book ORDER BY id ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		// �о�� �����͸� NameCard object�� ��ȯ�Ѵ�.
		List<NameCard> list = new ArrayList<NameCard>();
		NameCard nameCard = null;
		while (rs.next()) {
			nameCard = makeNameCard(rs);

			list.add(nameCard);
		}
		rs.close();
		pstmt.close();

		// �����ͺ��̽��� ������ �����Ѵ�.
		con.close();

		return list;
	}

	
	
	public static void main(String[] args) {
		try {
			JdbcStudy study = new JdbcStudy();
			List<NameCard> list = study.getList();

			for (NameCard card : list) {
				System.out.println(
						card.getId() + "  " + card.getName() + "  " + card.getPhoneNumber() + "  " + card.getAddress());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
