package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandExit extends Command {
	
	private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 

	public CommandExit(File dir, String[] tokens) {
		super(dir, tokens);
	}
	
	@Override
	public File execute() {
		// do nothing
		
		return dir;
	}

	@Override
	public boolean isStop() {
		return true;
	}

}
