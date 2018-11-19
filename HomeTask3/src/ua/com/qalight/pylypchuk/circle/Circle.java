package ua.com.qalight.pylypchuk.circle;

import ua.com.qalight.pylypchuk.Shape;

public class Circle implements Shape {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	} 

	
}
