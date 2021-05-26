package kr.hs.dgsw.java.c2.file;

import java.io.File;
import java.util.Scanner;

public class Cmd {
	
	private Scanner scanner;
	
	private File currentDirectory;
	
	public Cmd() {
		currentDirectory = new File("C:/");
	}

	public void execute() {
		scanner = new Scanner(System.in);
		
		while (true) {
		
			try {
				// �������͸� ����Ѵ�.
				showPrompt();
				
				// ����� ����� �Է¹޴´�.
				Command command = inputCommand();
				if (command.isExit()) {
					break;
				}
				
				// ����� ����� �����Ѵ�.
				currentDirectory = command.execute();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
		}	
		
		scanner.close();
	}
	
	private void showPrompt() {
		String str = String.format("%s>", 
				currentDirectory.getAbsolutePath());
		
		System.out.print(str);
	}
	
	private Command inputCommand() {
		String line = scanner.nextLine();
		String[] tokens = line.split(" ");
		
		return Command.build(tokens, currentDirectory);
	}
	
	public static void main(String[] args) {
		Cmd cmd = new Cmd();
		cmd.execute();
	}
	
}
