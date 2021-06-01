package kr.hs.dgsw.java.c2.jdbc;

public class DrirverTest {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
