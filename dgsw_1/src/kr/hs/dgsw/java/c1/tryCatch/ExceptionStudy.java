package kr.hs.dgsw.java.c1.tryCatch;

public class ExceptionStudy {

	public static void methodA() throws Exception {
		Exception e = new Exception("流立 父电 抗寇");
		throw e;
	}

	public static void methodB() {
		RuntimeException e = 
				new RuntimeException("流立 父电 抗寇");
		throw e;
	}
	
	public static void methodC() throws Exception {
		// do nothing
	}
	
	public static void methodD() throws RuntimeException {
		// do something
	}

	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		methodB();
		
		try {
			methodC();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		methodD();
	}
	
}
