package kr.hs.dgsw.java.c2.tr1;

public class Triangle extends Polygon {

	private double bottom;
	private double height;

	@Override
	public double getArea() {
		return bottom * height / 2.0;
	}
	
	@Override
	public String getName() {
		return "삼각형";
	}
	
	@Override
	protected void input() {
		System.out.println("밑변의 길이를 입력하세요.");
		setBottom(scanner.nextDouble());
		
		System.out.println("높이를 입력하세요.");
		setHeight(scanner.nextDouble());
	}
	
	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();

		triangle.input();
		triangle.printArea();
		
		triangle.closeScanner();
	}

}
