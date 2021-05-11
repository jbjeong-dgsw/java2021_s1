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
			throw new RuntimeException("���� : cd [dir]");
		}
		
		if (!dir.isDirectory() && !dir.exists()) {
			throw new RuntimeException("�������� �ʴ� ���丮�Դϴ�.");
		}
		
		return dir;
	}
	
}
