package kr.hs.dgsw.java.c3.file;

import java.io.File;

public class CommandLs extends Command {

	public CommandLs(File currentDirectory, String line) {
		super(currentDirectory, line);
	}
	
	@Override
	public void execute() {
		File[] files = currentDirectory.listFiles();
		
		for (File file : files) {
			showLine(file);
		}
	}
	
	public void showLine(File file) {
		String str = String.format("%s %s", file.getName(), 
				file.isDirectory() ? "<Dir>" : "<File>");
		
		System.out.println(str);
	}
}
