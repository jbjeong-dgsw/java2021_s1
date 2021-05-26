package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends Command {

	public CommandLs(String[] tokens, 
			File currentDirectory) {
		super(tokens, currentDirectory);
	}

	@Override
	public File execute() {
		File directory = null;
		
		if (tokens.length == 1) {
			directory = currentDirectory;
		} else {
			if (tokens[1].startsWith("/")) {
				directory = new File(tokens[1]);
			} else if (tokens[1].equals("..")) {
				directory = currentDirectory.getParentFile();
			} else {
				directory = new File(currentDirectory, tokens[1]);
			}
		}
		
		if (!directory.exists()) {
			throw new RuntimeException("존재하지 않는 디렉토리입니다.");
		}
		
		File[] children = directory.listFiles();
		for (File child : children) {
			showFileInfo(child);
		}
		
		return super.execute();
	}
	
	private void showFileInfo(File file) {
		String str = String.format("%-20s\t %s\t %s\t %d", 
				file.getName(), 
				(file.isFile() ? "<File>" : "<Dir>"),
				formatTime(file.lastModified()),
				file.length());
		
		System.out.println(str);
	}
	
	
	private String formatTime(long time) {
		Date date = new Date(time);
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return dateFormat.format(date);
	}
}
