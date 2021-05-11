package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class Command {
	
	protected File dir;
	
	protected String[] tokens;
	
	protected String option;
	
	protected List<String> args;
	
	public Command(File dir, String[] tokens) {
		this.dir = dir;
		this.tokens = tokens;
		
		prepare();
	}
	
	public abstract File execute();
	
	public boolean isStop() {
		return false;
	}

	
	private void prepare() {
		args = new ArrayList<String>();
		
		for (int i = 1 ; i < tokens.length ; i++) {
			if (tokens[i].startsWith("-")) {
				option = tokens[i];
			}
			else {
				args.add(tokens[i]);
			}
		}
	}
	
	protected String getOption() {
		return option;
	}
	
	protected String getArgument(int index) {
		try {
			return args.get(index);
		} catch (Exception e) {
			return null;
		}
	}
	
	protected File getSubDirectory(String dirName) {
		if (dirName == null) {
			dirName = "";
		}
		
		File subDir;
		if (dirName.startsWith("/")) {
			subDir = new File(dirName);
		} else {
			subDir = new File(dir, dirName);
		}
		
		if (!subDir.isDirectory() || !subDir.exists()) {
			throw new RuntimeException("존재하지 않는 디렉토리입니다.");
		}
		
		return subDir;
	}
	
	public static Command build(File dir, String line) {
		String[] tokens = line.split(" ");
		
		if ("ls".equals(tokens[0])) {
			return new CommandLs(dir, tokens);
		}
		else if ("cd".equals(tokens[0])) {
			return new CommandCd(dir, tokens);
		}
		else if ("exit".equals(tokens[0])) {
			return new CommandExit(dir, tokens);
		}
		else {
			throw new RuntimeException("잘못된 명령어입니다.");
		}
	}
	
}
