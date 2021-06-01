package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandMakeFile extends Command {
	
	public CommandMakeFile(File dir, String[] tokens) {
		super(dir, tokens);
	}
	
	@Override
	public File execute() {
		try {
			String fileName = getArgument(0);
			if (fileName == null) {
				System.out.println("사용법 : touch [fileName]");
			} else {
				File file = new File(dir, fileName);
				
				if (file.exists()) {
					System.out.println("이미 존재하는 파일입니다.");
				} else {
					file.createNewFile();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return dir;
	}


}
