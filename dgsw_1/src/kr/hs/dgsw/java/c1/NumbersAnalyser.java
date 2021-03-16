package kr.hs.dgsw.java.c1;

import java.util.Scanner;

public class NumbersAnalyser {
	public static final int SIZE = 3;
	
	private int[] values;

	private int index;
	
	public NumbersAnalyser() {
		values = new int[SIZE];
		index = 0;
	}
	
	public void setValue(int value)
	{
		if (index >= SIZE)
		{
			throw new RuntimeException("배열 범위 초과");
		}
		
		values[index] = value;
		index++;
	}
	
	public int getMin()
	{
		int min = 0;
		for (int i = 0 ; i < SIZE ; i++)
		{
			if (i == 0 || min > values[i])
			{
				min = values[i];
			}
		}
		
		return min;
	}
	
	public int getMax()
	{
		int max = 0;
		for (int i = 0 ; i < SIZE ; i++)
		{
			if (i == 0 || max < values[i])
			{
				max = values[i];
			}
		}
		
		return max;
	}
	
	public double getAverage() {
		int sum = 0;
		for (int value : values)
		{
			sum += value;
		}
		
		return ((double)sum / (double)values.length);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		NumbersAnalyser analyser = 
				new NumbersAnalyser();
		
		for (int i = 0 ; i < SIZE ; i++)
		{
			System.out.println(i + "번째 정수 입력 ");
			analyser.setValue(scanner.nextInt());
		}
		
		scanner.close();

		String result = 
				String.format("최소값 : %d, 최대값 : %d, 평균값 : %.2f", 
						analyser.getMin(), analyser.getMax(),
						analyser.getAverage());
		System.out.println(result);
	}
}
