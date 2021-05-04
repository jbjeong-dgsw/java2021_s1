package kr.hs.dgsw.java.c3.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileWriter {

	public static void main(String[] args) {
		try {
			File file = new File("C:/dgsw_3/abc");
			file.createNewFile();
			
			OutputStream os = new FileOutputStream(file);
			
			String str = "나 보기가 역겨워 가실 때에는";
			byte[] bytes = str.getBytes();
			System.out.println(Arrays.toString(bytes));
			
			for (byte b : bytes) {
				os.write(b);
			}
			
			//os.write(0x41);
			//os.write(0x65);
			//os.write(0x66);
			
			os.close();
			
			System.out.println("file length : " + file.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
