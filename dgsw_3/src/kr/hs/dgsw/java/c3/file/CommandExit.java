package kr.hs.dgsw.java.c3.file;

import java.io.File;

public class CommandExit extends Command {

	public CommandExit(File currentDirectory, String[] tokens) {
		super(currentDirectory, tokens);
	}
	
	public boolean isExit() {
		return true;
	};
}
