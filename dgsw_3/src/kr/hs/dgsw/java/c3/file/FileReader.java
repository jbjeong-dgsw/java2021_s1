package kr.hs.dgsw.java.c3.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileReader {

	public static void main(String[] args) {
		try {
			File file = new File("C:/dgsw_3/abc");
			
			InputStream is = new FileInputStream(file);
			
			long length = file.length();
			byte[] bytes = new byte[(int)length];
			
			for (int i = 0 ; i < length ; i++) {
				bytes[i] = (byte)(is.read() & 0x00FF);
			}
			
			String str = new String(bytes);
			System.out.println(str);
			
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
