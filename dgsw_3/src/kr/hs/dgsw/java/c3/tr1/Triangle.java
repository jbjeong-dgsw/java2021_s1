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
		return "»ï°¢Çü";
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

		triangle.setHeight(25);
		triangle.setBottom(12);
		
		triangle.printSize();
	}

}
