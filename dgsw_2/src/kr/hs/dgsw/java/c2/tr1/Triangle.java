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
		return "»ï°¢Çü";
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

		triangle.setBottom(8);
		triangle.setHeight(6);
		
		triangle.printArea();
	}

}
