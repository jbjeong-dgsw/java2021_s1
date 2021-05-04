package kr.hs.dgsw.java.c1.file;

import java.io.File;

public class FileLab {

	public static void main(String[] args) throws Exception {
		
		File file = new File("c://dgsw_class", "sample.txt");
		System.out.println("getName : " + file.getName());
		
		boolean exists = file.exists();
		System.out.println("exists : " + exists);
		
		boolean isDirectory = file.isDirectory();
		System.out.println("isDirectory : " + isDirectory);
		
		File dir = new File("C://dgsw_class");
		isDirectory = dir.isDirectory();
		System.out.println("isDirectory : " + isDirectory);
		
		String path = file.getAbsolutePath();
		System.out.println("getAbsolutePath : " + path);
		
		String path1 = file.getCanonicalPath();
		System.out.println("getCanonicalPath : " + path1);
		
		long length = file.length();
		System.out.println("length : " + length);
		
		length = dir.length();
		System.out.println("length of dir : " + length);
		
	}
	
	
}
