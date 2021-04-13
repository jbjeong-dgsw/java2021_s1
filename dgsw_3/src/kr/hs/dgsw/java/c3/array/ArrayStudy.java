package kr.hs.dgsw.java.c3.array;

import java.util.Random;

import kr.hs.dgsw.java.c3.tr1.Triangle;

public class ArrayStudy {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 10;
		intArray[1] = 3;
		//intArray[5] = 7;
		
		System.out.println(intArray[3]);
		
		System.out.println(intArray.length);
		
		Triangle[] triangleArray = new Triangle[10];
		triangleArray[0] = new Triangle();
		
		Random random = new Random();
		for (int i = 0 ; i < intArray.length ; i++) {
			intArray[i] = random.nextInt(1000);
		}
		
		for (int value : intArray) {
			System.out.println(value);
		}		
	}
}
