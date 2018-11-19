package ua.com.qalight.pylypchuk.square;

import ua.com.qalight.pylypchuk.Shape;

public class Square1 implements Shape{
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	public Square1(double side) {
		super();
		this.side = side;
	}
	
	
	

}
