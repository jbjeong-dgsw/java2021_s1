package kr.hs.dgsw.java.c2.file;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class ImageConverter {

	public void convert(String original, String target,
			String type) throws Exception {
		
		File originalFile = new File(original);
		BufferedImage image = ImageIO.read(originalFile);

		File targetFile = new File(target);
		ImageIO.write(image, type, targetFile);
		System.out.println("ok");
	}
	
	public void half(String original, String target) throws Exception
	{
		File originalFile = new File(original);
		File targetFile = new File(target);
		
		InputStream is = new FileInputStream(originalFile);
		OutputStream os = new FileOutputStream(targetFile);
		
		int count = 0;
		while (is.available() > 0) {
			int value = is.read();
			//if (count % 2 == 0) 
			{
				os.write(value);
			}
			count++;
		}
		
		is.close();
		os.close();
	}
	
	
	public static void main(String[] args) {
		try {
			ImageConverter converter = new ImageConverter();
			converter.convert("C:/dgsw_2/»Ç·Î·Î.jfif", "C:/dgsw_2/»Ç·Î·Î.bmp", "bmp");
			
			converter.half("C:/dgsw_2/»Ç·Î·Î.bmp", "C:/dgsw_2/»Ç·Î·Î1.bmp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
