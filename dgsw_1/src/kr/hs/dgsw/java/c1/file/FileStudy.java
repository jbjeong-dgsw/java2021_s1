package kr.hs.dgsw.java.c1.file;

import java.io.File;

public class FileStudy {

	public File makeFile(String directory, 
			String fileName) throws Exception {
		File file = new File(directory, fileName);
		boolean result = file.createNewFile();
		
		System.out.println("���� ���� : " + result);
		
		return file;
	}
	
	public void deleteFile(File file) throws Exception {
		boolean result = file.delete();
		System.out.println("���� ���� : " + result);
	}
	
	public File rename(File file, String newName) 
			throws Exception {
		
		File renamed = new File(file.getParent(), newName);
		
		boolean result = file.renameTo(renamed);
		System.out.println("�̸� ���� : " + result + "  " + 
				renamed.getAbsolutePath());
		
		return renamed;
	}
	
	public void move(File file, String directory) {
		File newLocation = 
				new File(file.getParent() + "/" + directory, 
						file.getName());
		
		boolean result = file.renameTo(newLocation);
		System.out.println("��ġ �̵� : " + result + "  " + 
				file.getAbsolutePath());
	}
	
	public static void main(String[] args) {
		try {
			FileStudy fileStudy = new FileStudy();
			File file = 
					fileStudy.makeFile("C://dgsw_class", "first.abc");
			
			file = fileStudy.rename(file, "second.qqq");
			fileStudy.move(file, "sub1");
			
			//fileStudy.deleteFile(file);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
