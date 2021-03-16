package kr.hs.dgsw.java.c3;

public class Accumulator {
	int sum;
	
	public void add(int value) {
		sum += value;
	}
	
	public boolean checkQuit(int value)
	{
		return (-9999 == value);
	}
	
	public void print()
	{
		System.out.println("누적값 : " + sum);
	}
	
	public int getSum()
	{
		return sum;
	}
}
