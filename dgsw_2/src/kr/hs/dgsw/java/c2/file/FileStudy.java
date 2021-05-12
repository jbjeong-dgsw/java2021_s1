package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.util.Date;

public class FileStudy {

	public static void main(String[] args) {
		try {
			File file = new File("c:/dgsw_2/abc.txt");
			boolean exist = file.exists();
			System.out.println("exist : " + exist);
		
			file = new File("c:/dgsw_2/가나다.txt");
			boolean result = file.createNewFile();
			System.out.println("createNewFile : " + result);
			
			file.delete();
			
			File dir = new File("C:/dgsw_2/sub");
			result = dir.mkdir();
			System.out.println("mkdir : " + result);
			
			dir.delete();
			
			File hello = new File("C:/dgsw_2/hello");
			System.out.println("isFile : " + hello.isFile());
			System.out.println("isDirectory : " + hello.isDirectory());
			
			System.out.println("getName : " + hello.getName());
			System.out.println("getAbsolutePath : " + hello.getAbsolutePath());
			System.out.println("length : " + hello.length());
			System.out.println("lastModified : " + hello.lastModified());
			
			long lastModified = hello.lastModified();
			Date date = new Date(lastModified);
			System.out.println("lastModified : " + date.toString());
			
			String parent = hello.getParent();
			System.out.println("getParent : " + parent);
			
			System.out.println("------------ list ----------");
			dir = new File("C:/dgsw_2");
			File[] list = dir.listFiles();
			for (File file1 : list) {
				System.out.println(file1.getName());
			}
			
			File renamed = new File("C:/반갑습니다");
			hello.renameTo(renamed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
