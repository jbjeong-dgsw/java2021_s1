package kr.hs.dgsw.java.c1;

public class AccumulatorRunner {
	public static void main(String[] args) {
		
		Accumulator accumulator = new Accumulator(0);

		accumulator.print();
		accumulator.add(8);
		accumulator.add(7);
		accumulator.add(-2);
		
		System.out.println("Result : " + 
				accumulator.getSum());
	}
}
