package kr.hs.dgsw.java.c2;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0 ; i < args.length ; i++)
		{
			int value = Integer.parseInt(args[i]);
			sum += value;
		}
		
		System.out.println("Total : " + sum);
	}

}
