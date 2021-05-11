package kr.hs.dgsw.java.c3.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class Command {

	protected File currentDirectory;
	
	protected String[] tokens;
	
	protected String word;
	
	protected String option;
	
	protected List<String> args;
	
	public Command(File currentDirectory, String[] tokens) {
		this.currentDirectory = currentDirectory;
		this.tokens = tokens;
		analizeLine();
	}

	public File execute() {
		return currentDirectory;
	}
	
	public boolean isExit() {
		return false;
	}

	private void analizeLine() {
		word = tokens[0];
		
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
	
	protected File getDirectory(String dirName) {
		File dir = null;
		
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
		
		return dir;
	}
	
	public static Command build(File currentDirectory, String line) {
		Command command = null;
		String[] tokens = line.split(" ");
		
		if ("exit".equals(tokens[0])) {
			command = new CommandExit(currentDirectory, tokens);
		}
		else if ("ls".equals(tokens[0])) {
			command = new CommandLs(currentDirectory, tokens);
		}
		else if ("cd".equals(tokens[0])) {
			command = new CommandCd(currentDirectory, tokens);
		}
		else {
			throw new RuntimeException("잘못된 명령어입니다.");
		}
		
		return command;
	}
	
	
}
