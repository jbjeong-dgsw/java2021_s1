package kr.hs.dgsw.java.c3.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TxtReaderWriter {

	public void write(File file, String str) throws Exception {
		BufferedWriter writer = 
				new BufferedWriter(new FileWriter(file));
		
		writer.write(str);
		writer.close();
	}
	
	public String read(File file) throws Exception {
		BufferedReader reader = 
				new BufferedReader(new FileReader(file));
		
		String line = null;
		String str = "";
		while (true) {
			line = reader.readLine();
			if (line == null) {
				break;
			}
			
			str += line + "\n";
		}
		
		reader.close();
		
		return str;
	}
	
	public static void main(String[] args) {
		try {
			TxtReaderWriter txt = new TxtReaderWriter();
			
			String str = "한 송이 국화꽃을 피우기 위해\n";
			str += "봄부터 소쩍새는 그렇게 울었나 보다.\n";
			str += "한 송이 국화꽃을 피우기 위해\n";
			str += "천둥은 먹구름 속에서 또 그렇게 울었나 보다.";
			
			File file = new File("C:/dgsw_3/국화옆에서.txt");
			txt.write(file, str);
			
			String str1 = txt.read(file);
			System.out.println(str1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
