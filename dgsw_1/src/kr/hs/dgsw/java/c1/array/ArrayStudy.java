package kr.hs.dgsw.java.c1.array;

import java.util.Random;

import kr.hs.dgsw.java.c1.Cat;

public class ArrayStudy {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		double[] doubleArray = new double[7];
		Cat[] catArray = new Cat[10];
		
		System.out.println(intArray[1]);
		intArray[0] = 5;
		intArray[2] = 3;
		System.out.println(intArray[0]);
		//System.out.println(intArray[5]);
		
		System.out.println(catArray[1]);
		
		Random random = new Random();
		
		for (int i = 0 ; i < intArray.length ; i++) {
			intArray[i] = random.nextInt(1000);
		}
		
		for (int value : intArray) {
			System.out.println(value);
		}
		
	}
	
}
