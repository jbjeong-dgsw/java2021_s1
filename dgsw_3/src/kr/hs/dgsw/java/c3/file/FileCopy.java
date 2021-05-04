package kr.hs.dgsw.java.c3.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public void copy(File original, File target) 
			throws Exception {
		InputStream is = new FileInputStream(original);
		OutputStream os = new FileOutputStream(target);

		int length;
		
		byte[] buffer = new byte[1024];
		
		while (is.available() > 0) {
			length = is.read(buffer);
			
			os.write(buffer, 0, length);
		}
		
		
		os.close();
		is.close();
	}
	
	public static void main(String[] args) {
		try {
			File original = new File("C:/dgsw_3/aaa.mp4");
			File target = new File("C:/dgsw_3/copied.mp4");
			
			FileCopy fileCopy = new FileCopy();
			
			long before = System.currentTimeMillis();
			fileCopy.copy(original, target);
			long after = System.currentTimeMillis();
			
			System.out.println(original.length() + "  " + 
					(after - before));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
