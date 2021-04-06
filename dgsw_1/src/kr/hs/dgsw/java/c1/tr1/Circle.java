package kr.hs.dgsw.java.c1.tr1;

public class Circle extends Polygon {

	private double radius;

	@Override
	public String getName() {
		return "원";
	}
	
	@Override
	public double calculateArea() {
		return Math.pow((Math.PI * radius), 2);
	}

	@Override
	public void input() {
		System.out.println("반지름을 입력하세요.");
		setRadius(scanner.nextDouble());
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.execute();
	}

}
