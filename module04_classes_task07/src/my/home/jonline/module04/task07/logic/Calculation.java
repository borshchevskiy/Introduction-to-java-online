package my.home.jonline.module04.task07.logic;

import my.home.jonline.module04.task07.entity.Point;
import my.home.jonline.module04.task07.entity.Triangle;

public class Calculation {

	
	public double findPerimeter(Triangle triangle) {
		double perimeter;
		
		perimeter = triangle.getSideAB() + triangle.getSideBC() + triangle.getSideAC();
		
		return perimeter;
	}
	
	public double findSquare(Triangle triangle) {
		double square;
		double halfPerimeter;
		
		halfPerimeter = findPerimeter(triangle) / 2;
	
		square = Math.sqrt(halfPerimeter * (halfPerimeter - triangle.getSideAB()) * (halfPerimeter - triangle.getSideBC()) * (halfPerimeter - triangle.getSideAC()));
		
		return square;
	}
	
	public Point findMedianCrossPoint(Triangle triangle) {
		Point medianCrossPoint;
		double medianCrossPointX;
		double medianCrossPointY;
		
		medianCrossPointX = (triangle.getPointA().getX() + triangle.getPointB().getX() + triangle.getPointC().getX()) / 3;
		medianCrossPointY = (triangle.getPointA().getY() + triangle.getPointB().getY() + triangle.getPointC().getY()) / 3;
		
		medianCrossPoint = new Point(medianCrossPointX, medianCrossPointY);
		
		return medianCrossPoint;
	}
}
