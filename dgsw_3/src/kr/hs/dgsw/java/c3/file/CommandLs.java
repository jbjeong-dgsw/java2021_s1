package kr.hs.dgsw.java.c3.file;

import java.io.File;

public class CommandLs extends Command {

	public CommandLs(File currentDirectory, String[] tokens) {
		super(currentDirectory, tokens);
	}
	
	@Override
	public void execute() {
		File dir = null;
		
		if (args.size() > 0) {
			String dirName = args.get(0);
			
			if (dirName.startsWith("/")) {
				dir = new File(dirName);
			}
			else if (dirName.equals("..")) {
				dir = currentDirectory.getParentFile();
			} 
			else if (dirName.equals(".")) {
				dir = currentDirectory;
			}
			else {
				dir = new File(currentDirectory, dirName);
			}
		}
		else {
			dir = currentDirectory;
		}
		
		File[] files = dir.listFiles();
		
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
