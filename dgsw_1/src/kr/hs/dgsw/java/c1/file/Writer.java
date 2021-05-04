package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Writer {

	public static void main(String[] args) {

		try {

			File file = new File("C://dgsw_class", "fileA");
			file.createNewFile();

			OutputStream os = new FileOutputStream(file);

			String str = "나 보기가 역겨워 가실 때에는 말없이 고이 보내 드리오리다";
			byte[] bytes = str.getBytes();

			/*
			for (byte byte1 : bytes) {
				os.write(byte1);
			}
			*/

			os.write(bytes);

			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
