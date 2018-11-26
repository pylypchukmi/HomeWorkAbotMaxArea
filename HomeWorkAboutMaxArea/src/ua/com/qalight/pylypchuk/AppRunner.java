package ua.com.qalight.pylypchuk;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ua.com.qalight.pylypchuk.circle.Circle;
import ua.com.qalight.pylypchuk.square.Square;


public class AppRunner {
	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
	Square squ1 = new Square(4);
	Square squ2 = new Square(5);
	Square squ4 = new Square(6);
	Square squ3 = new Square(7);
	Square squ5 = new Square(9);
	Circle ci1 = new Circle(2);
	Circle ci2 = new Circle(4.5);

	List<Shape> shapes = new ArrayList<>();
	
	shapes.add(squ1);
	shapes.add(squ2);
	shapes.add(squ3);
	shapes.add(squ4);
	shapes.add(squ5);
	shapes.add(ci1);
	shapes.add(ci2);
	
	Shape maxShape = shapes.get(0);
    for(int i = 0; i < shapes.size(); i++) {
      Shape shape = shapes.get(i);
      
      if(maxShape.getArea() < shape.getArea()) {
        maxShape = shape;
      }   
    }
    logger.info("Maximal area is " + maxShape.getArea());
    Shape minShape = shapes.get(0);
    for(int i = 7; i > shapes.size(); i--) {
      Shape shape = shapes.get(i);
      logger.info(String.valueOf(shape.getArea()));
      
      if(minShape.getArea() > shape.getArea()) {
        minShape = shape;
      }
    }
    logger.info("Minimal area is " + minShape.getArea());
	
	}

}
