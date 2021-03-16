package kr.hs.dgsw.java.c1;

public class Accumulator {
	int sum;

	public Accumulator(int initValue) {
		sum = initValue;
	}

	public void add(int value) {
		sum += value;
	}

	public void print() {
		System.out.println(sum);
	}

	public int getSum() {
		return sum;
	}

	
}
