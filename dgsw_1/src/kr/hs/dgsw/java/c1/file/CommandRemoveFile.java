package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandRemoveFile extends Command {
	
	public CommandRemoveFile(File dir, String[] tokens) {
		super(dir, tokens);
	}
	
	@Override
	public File execute() {
		try {
			String fileName = getArgument(0);
			if (fileName == null) {
				System.out.println("���� : rm [fileName]");
			} else {
				File file = new File(dir, fileName);
				
				if (!file.exists()) {
					System.out.println("������ �������� �ʽ��ϴ�");
				} else {
					file.delete();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return dir;
	}


}
