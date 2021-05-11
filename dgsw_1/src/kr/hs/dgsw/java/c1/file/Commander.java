package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.util.Scanner;

public class Commander {

	private File dir;
	
	private Scanner scanner;
	
	public Commander() {
		dir = new File("C://");
		scanner = new Scanner(System.in);
	}
	
	public void execute() {
		
		Command command = null;
		
		while (true) {
			showPrompt();
			
			try {
				command = inputCommand();
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			if (command.isStop()) {
				break;
			}
			
			dir = command.execute();
		}
		
		scanner.close();
	}
	
	private void showPrompt() {
		System.out.print(String.format("%s> ", dir.getAbsolutePath()));
	}
	
	private Command inputCommand() {
		String line = scanner.nextLine();

		return Command.build(dir, line);
	}
	
	public static void main(String[] args) {
		
		Commander commander = new Commander();
		commander.execute();
		
	}
	
}
