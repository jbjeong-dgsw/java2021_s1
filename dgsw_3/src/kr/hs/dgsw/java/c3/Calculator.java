package kr.hs.dgsw.java.c3;

public class Calculator {
	
	static int plus(int value1, int value2)
	{
		return value1 + value2;
	}

	static int minus(int value1, int value2)
	{
		return value1 - value2;
	}

	static int multiply(int value1, int value2)
	{
		return value1 * value2;
	}

	static int divide(int value1, int value2)
	{
		return value1 / value2;
	}

	static void display(int value1, int value2, 
			int result, String operator)
	{
		String resultString = 
				String.format("%d %s %d = %d", 
						value1, operator, value2,
						result);
		
		System.out.println(resultString);
	}
	
	public static void main(String[] args) {
		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		
		display(value1, value2, 
				plus(value1, value2), "+");

		display(value1, value2, 
				minus(value1, value2), "-");
		
		display(value1, value2, 
				multiply(value1, value2), "*");
		
		display(value1, value2, 
				divide(value1, value2), "/");
	}
}
