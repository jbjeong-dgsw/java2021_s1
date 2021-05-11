package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends Command {
	
	private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 

	public CommandLs(File dir, String[] tokens) {
		super(dir, tokens);
	}
	
	@Override
	public File execute() {
		try {
			File directory = getSubDirectory(getArgument(0));
			File[] files = directory.listFiles();		

			showList(files);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return dir;
	}

	private void showList(File[] files) {
		boolean detail = hasDetailOption();
		
		for (File file : files) {
			if (detail) {
				showLineDetail(file);
			}
			else {
				showLineSimple(file);
			}
		}
	}
	
	private boolean hasDetailOption() {
		String option = getOption();
		return (option != null && option.indexOf("a") >= 0);
	}

	private void showLineDetail(File file) {

		String str = String.format("%-20s  %s  %-5s  %10d", 
				makeName(file), 
				getDate(file),
				file.isDirectory() ? "<DIR>" : "",
				file.length());
		
		System.out.println(str);
		
	}
	
	private void showLineSimple(File file) {

		String str = String.format("%-20s", 
				makeName(file));
		
		System.out.println(str);
		
	}
	
	private String getDate(File file) {
		Date date = new Date(file.lastModified());
		return DATE_FORMAT.format(date);
	}
	
	private String makeName(File file) {
		String name = file.getName();
		
		if (name.length() > 20) {
			return name.substring(0, 18) + "..";
		}
		else {
			return name;
		}
	}

}
