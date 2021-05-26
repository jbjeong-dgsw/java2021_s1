package kr.hs.dgsw.java.c2.file;

import java.io.File;

public class CommandExit extends Command {

	public CommandExit(String[] tokens, 
			File currentDirectory) {
		super(tokens, currentDirectory);
	}

	@Override
	public boolean isExit() {
		return true;
	}
}
