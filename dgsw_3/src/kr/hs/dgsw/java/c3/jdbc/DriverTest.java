package kr.hs.dgsw.java.c3.jdbc;

public class DriverTest {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
