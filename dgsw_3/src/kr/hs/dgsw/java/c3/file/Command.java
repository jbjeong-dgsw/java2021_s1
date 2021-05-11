package kr.hs.dgsw.java.c3.file;

import java.io.File;

public abstract class Command {

	protected File currentDirectory;
	
	protected String line;
	
	public Command(File currentDirectory, String line) {
		this.currentDirectory = currentDirectory;
		this.line = line;
	}

	public void execute() {
		
	}
	
	public boolean isExit() {
		return "exit".equals(line);
	}
	
	public static Command build(File currentDirectory, String line) {
		Command command = null;
		
		if ("exit".equals(line)) {
			
		}
		else if ("ls".equals(line)) {
			command = new CommandLs(currentDirectory, line);
		}
		else {
			throw new RuntimeException("잘못된 명령어입니다.");
		}
		
		return command;
	}
	
	
}
