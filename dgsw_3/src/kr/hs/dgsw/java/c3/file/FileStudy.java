package kr.hs.dgsw.java.c3.file;

import java.io.File;
import java.util.Date;

public class FileStudy {

	public void fileInfo() {
		File file = new File("c:/dgsw_3/sample.txt");
		
		String name = file.getName();
		System.out.println("getName : " + name);
		
		boolean exist = file.exists();
		System.out.println("exists : " + exist);
		
		String path = file.getAbsolutePath();
		System.out.println("getAbsolutePath : " + path);

		long length = file.length();
		System.out.println("length : " + length);
		
		boolean isFile = file.isFile();
		System.out.println("isFile : " + isFile);
		
		File parent = file.getParentFile();
		System.out.println("getParentFile : " + parent.getAbsolutePath());
		
		long lastModified = file.lastModified();
		System.out.println("lastModified : " + new Date(lastModified));
	}
	
	public File makeRealFile(String filePath) throws Exception {
		File file = new File(filePath);
		file.createNewFile();
		
		return file;
	}
	
	public void deleteFile(String filePath) throws Exception {
		File file = new File(filePath);
		file.delete();
	}
	
	public File makeDirectory(String path) throws Exception {
		File dir = new File(path);
		dir.mkdirs();
		
		return dir;
	}
	
	public static void main(String[] args) {
		try {
			FileStudy fileStudy = new FileStudy();
			fileStudy.fileInfo();
			
			//fileStudy.makeRealFile("C:/dgsw_3/first.txt");
			//fileStudy.deleteFile("C:/dgsw_3/first.txt");
			
			//fileStudy.makeDirectory("C:/dgsw_3/dir1/dir2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
