package ua.com.qalight.pylypchuk.square;

import ua.com.qalight.pylypchuk.Shape;

public class Square  implements Shape{
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

}
