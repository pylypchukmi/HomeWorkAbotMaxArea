package ua.com.qalight.pylypchuk;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ua.com.qalight.pylypchuk.circle.Circle;
import ua.com.qalight.pylypchuk.pryamougolnik.Pryamougolnik;
import ua.com.qalight.pylypchuk.square.Square1;
import ua.com.qalight.pylypchuk.triangle.Triangle1;
import ua.com.qalight.pylypchuk.triangle.Triangle2;
import ua.com.qalight.pylypchuk.square.Square2;
import ua.com.qalight.pylypchuk.triangle.Triangle3;

public class AppRunner {
	static Logger logger = Logger.getLogger(AppRunner.class.getName());

	Triangle1 tri1 = new Triangle1(2, 2);
	Triangle2 tri2 = new Triangle2(4, 2);
	Triangle3 tri3 = new Triangle3(3, 4);
	Square1 squ1 = new Square1(4);
	Square2 squ2 = new Square2(5);
	Circle ci = new Circle(2);
	Pryamougolnik pry = new  Pryamougolnik(3, 5);
	
	List<Integer> shapes = new ArrayList<>();
	Shape maxShape = shapes.get(0);
    for(int i = 0; i < 10; i++){
        Shape shape = shapes.get(i);
        logger.info(String.valueOf(shape.getArea()));
    }
        if(maxShape.getArea() < shape.getArea()) {
          maxShape = shape;
        }
        
    }}


        
    

