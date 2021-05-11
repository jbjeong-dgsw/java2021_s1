package kr.hs.dgsw.java.c3.file;

import java.io.File;

public class CommandLs extends Command {

	public CommandLs(File currentDirectory, String[] tokens) {
		super(currentDirectory, tokens);
	}
	
	@Override
	public File execute() {
		File dir = null;
		
		if (args.size() > 0) {
			String dirName = args.get(0);
			dir = getDirectory(dirName);
		}
		else {
			dir = currentDirectory;
		}
		
		if (!dir.isDirectory() && !dir.exists()) {
			throw new RuntimeException("존재하지 않는 디렉토리입니다.");
		}
		
		File[] files = dir.listFiles();
		
		for (File file : files) {
			showLine(file);
		}
		
		return currentDirectory;
	}
	
	public void showLine(File file) {
		String str = String.format("%s %s", file.getName(), 
				file.isDirectory() ? "<Dir>" : "<File>");
		
		System.out.println(str);
	}
}
