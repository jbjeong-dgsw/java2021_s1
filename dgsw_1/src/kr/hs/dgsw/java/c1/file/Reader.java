package kr.hs.dgsw.java.c1.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

public class Reader {

	public static void main(String[] args) {
		
		try {
			File file = new File("C://dgsw_class/fileA");
			InputStream is = new FileInputStream(file);
			BufferedReader reader = 
					new BufferedReader(new FileReader(file));
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			/*
			byte[] buffer = new byte[10];
			byte[] bytes = new byte[0];
			//int length = is.read(buffer);
			//String str = new String(buffer, 0, length);
			
			String str = null;
			int length;
			while (is.available() > 0) {
				length = is.read(buffer);

				
				str = new String(buffer, 0, length);
				System.out.println(str);
			}
			
			//System.out.println(str);
			
			*/
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
