package kr.hs.dgsw.java.c1.tr1;

public class Triangle extends Polygon {

	private double bottom;
	private double height;

	@Override
	public String getName() {
		return "�ﰢ��";
	}
	
	@Override
	public double calculateArea() {
		return bottom * height / 2.0;
	}
	
	@Override
	public void input() {
		System.out.println("�غ��� �Է��ϼ���.");
		setBottom(scanner.nextDouble());

		System.out.println("���̸� �Է��ϼ���.");
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
		triangle.execute();
	}

}
