package kr.hs.dgsw.java.c3.file;

import java.io.File;
import java.util.Scanner;

public class Commander {

	private File currentDirectory;
	
	private Scanner scanner;
	
	public Commander() {
		currentDirectory = new File("C://");
		scanner = new Scanner(System.in);
	}
	
	public void execute() {
		Command command = null;
		
		while (true) {
			// �������͸� �����ش�.
			showPrompt();
			
			// ����� �Է��� �޴´�.
			try {
				command = inputCommand();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			// exit ����̶�� loop�� �����.
			if (command.isExit()) {
				break;
			}
			
			// ����� �����Ѵ�.
			command.execute();
		}
		
		scanner.close();
	}
	
	private void showPrompt() {
		String prompt = String.format("%s>", currentDirectory.getAbsolutePath());
		System.out.print(prompt);
	}
	
	private Command inputCommand() {
		String line = scanner.nextLine();
		return Command.build(currentDirectory, line);
	}
	
	
	public static void main(String[] args) {
		Commander commander = new Commander();
		commander.execute();
	}
}
