package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class CommandCd extends Command {

	public CommandCd(String[] tokens, 
			File currentDirectory) {
		super(tokens, currentDirectory);
	}

	@Override
	public File execute() {
		File directory = null;
		
		if (tokens.length == 1) {
			throw new RuntimeException("���� : cd [dir]");
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
			throw new RuntimeException("�������� �ʴ� ���丮�Դϴ�.");
		}
		
		return directory;
	}
	
	
}
