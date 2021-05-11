package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandCd extends Command {
	
	public CommandCd(File dir, String[] tokens) {
		super(dir, tokens);
	}
	
	@Override
	public File execute() {
		try {
			File directory = getSubDirectory(getArgument(0));
			
			return directory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return dir;
	}


}
