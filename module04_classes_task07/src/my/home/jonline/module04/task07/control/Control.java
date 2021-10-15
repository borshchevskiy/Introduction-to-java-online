package my.home.jonline.module04.task07.control;

import my.home.jonline.module04.task07.entity.Point;
import my.home.jonline.module04.task07.entity.Triangle;

public class Control {

	public Triangle createTriangle() {
		return new Triangle();
	}
	
	public Triangle createTriangle(Point pointA, Point pointB, Point pointC) {
		return new Triangle(pointA, pointB, pointC);
	}
}
