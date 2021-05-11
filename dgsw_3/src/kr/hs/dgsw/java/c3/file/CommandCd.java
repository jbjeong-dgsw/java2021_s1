package kr.hs.dgsw.java.c3.file;

import java.io.File;

public class CommandCd extends Command {

	public CommandCd(File currentDirectory, String[] tokens) {
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
			throw new RuntimeException("사용법 : cd [dir]");
		}
		
		if (!dir.isDirectory() && !dir.exists()) {
			throw new RuntimeException("존재하지 않는 디렉토리입니다.");
		}
		
		return dir;
	}
	
}
