package kr.hs.dgsw.java.c3.tr1;

public class Triangle extends Polygon {

	private double height;
	private double bottom;

	@Override
	public double getSize() {
		return bottom * height / 2;
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
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();

		triangle.input();
		
		triangle.printSize();
	}

}
