package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public void copySlow(String source, String target) 
			throws Exception {
		long before = System.currentTimeMillis();
		
		File sourceFile = new File(source);
		File targetFile = new File(target);
		
		InputStream is = new FileInputStream(sourceFile);
		OutputStream os = new FileOutputStream(targetFile);
		
		while (is.available() > 0) {
			int value = is.read();
			os.write(value);
		}
		
		is.close();
		os.close();
		
		long after = System.currentTimeMillis();
		System.out.println("½Ã°£ : " + (after - before));
	}
	
	public void copyFast(String source, String target) 
			throws Exception {
		long before = System.currentTimeMillis();
		
		File sourceFile = new File(source);
		File targetFile = new File(target);
		
		InputStream is = new FileInputStream(sourceFile);
		OutputStream os = new FileOutputStream(targetFile);
		
		byte[] buffer = new byte[1024];
		
		while (is.available() > 0) {
			int length = is.read(buffer);
			os.write(buffer, 0, length);
		}
		
		is.close();
		os.close();
		
		long after = System.currentTimeMillis();
		System.out.println("½Ã°£ : " + (after - before));
	}
	
	public static void main(String[] args) {
		FileCopy copy = new FileCopy();
		
		try {
			copy.copySlow("C:/dgsw_2/»Ç·Î·Î.bmp", "C:/dgsw_2/pororo.bmp");
			copy.copyFast("C:/dgsw_2/»Ç·Î·Î.bmp", "C:/dgsw_2/pororo1.bmp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
