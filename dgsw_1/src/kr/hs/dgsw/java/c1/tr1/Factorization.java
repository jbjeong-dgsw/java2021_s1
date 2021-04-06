package kr.hs.dgsw.java.c1.tr1;

public class Factorization {

	public String findPrimeNumbers (int number) {
		String result = "";
		
		if (isPrimeNumber(number)) {
			return number + ", ";
		}
		
		for (int i = 2 ; i <= number / 2 ; i++)
		{
			if (number % i == 0)
			{
				result += i + ", " + findPrimeNumbers(number / i);
				break;
			}
		}
		
		return result;
	}
	
	private boolean isPrimeNumber(int value) {
		for (int i = 2 ; i < value ; i++)
		{
			if (value % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Factorization factorization = new Factorization();
		
		System.out.println(factorization.findPrimeNumbers(30));
	}
	
	
}
