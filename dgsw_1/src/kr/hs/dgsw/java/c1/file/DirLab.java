package kr.hs.dgsw.java.c1.file;

import java.io.File;

public class DirLab {
	
	public static void main(String[] args) 
			throws Exception {

		File dir = new File("C://dgsw_class//sub3", "qqqq");
		
		boolean exist = dir.exists();
		System.out.println("exists : " + exist);
		
		boolean result = dir.mkdirs();
		System.out.println("mkdir : " + result);
		
		dir.delete();
		
		File dir1 = new File("C://dgsw_class");
		File[] files = dir1.listFiles();
		for (File file : files) {
			//System.out.println(file.getName());
			System.out.println(buildFileInformation(file));
		}
	}
	
	public static String buildFileInformation(File file) {
		String result = "";
		
		if (file.isDirectory()) {
			result += "D ";
		}
		else {
			result += "F ";
		}
		result += file.getName() + " ";
		
		if (!file.isDirectory()) {
			result += file.length();
		}
		
		return result;
	}
	

}
