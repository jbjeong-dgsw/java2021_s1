package kr.hs.dgsw.java.c3;

import java.util.Scanner;

public class NumberAnalyser {

	private static final int SIZE = 5;
	
	private int[] values;
	
	private int index;
	
	public NumberAnalyser() {
		values = new int[SIZE];
		index = 0;
	}
	
	public void setValue(int value) {
		if (index >= SIZE)
		{
			throw new RuntimeException("배열 크기 초과");
		}
		
		values[index] = value;
		index++;
	}
		
	public int getMinimum() {
		int min = values[0];
		
		for (int i = 1 ; i < SIZE ; i++) {
			if (min > values[i])
			{
				min = values[i];
			}
		}
		
		return min;
	}

	public int getMaximum() {
		int max = values[0];
		
		for (int i = 1 ; i < SIZE ; i++) {
			if (max < values[i])
			{
				max = values[i];
			}
		}
		
		return max;
	}
	
	public int getSum() {
		int sum = 0;
		
		for (int value : values)
		{
			sum += value;
		}
		
		return sum;
	}

	public double getAverage() {
		return (double)getSum() / (double)values.length;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		NumberAnalyser analyser = new NumberAnalyser();
		
		for (int i = 0 ; i < SIZE ; i++)
		{
			System.out.println("정수를 입력하세요.");
			int value = scanner.nextInt();
			analyser.setValue(value);
		}
		
		String result = 
				String.format("최소값 : %d  최대값 : %d  평균값 : %.2f", 
						analyser.getMinimum(),
						analyser.getMaximum(),
						analyser.getAverage());
		System.out.println(result);

		scanner.close();
	}
	
}
