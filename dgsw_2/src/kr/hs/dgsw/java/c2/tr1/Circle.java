package kr.hs.dgsw.java.c2.tr1;

public class Circle extends Polygon {

	private double radius;

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String getName() {
		return "원";
	}
	
	@Override
	protected void input() {
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
		
		circle.input();
		circle.printArea();
		
		circle.closeScanner();
	}
}
