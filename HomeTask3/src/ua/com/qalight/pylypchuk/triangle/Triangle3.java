package ua.com.qalight.pylypchuk.triangle;

import ua.com.qalight.pylypchuk.Shape;

public class Triangle3 implements Shape {

	private double height;
	private double base;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double getArea() {
		return height*base/2;
	}
	public Triangle3(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

}
