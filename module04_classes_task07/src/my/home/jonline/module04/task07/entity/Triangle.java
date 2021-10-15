package my.home.jonline.module04.task07.entity;

public class Triangle {

	Point pointA;
	Point pointB;
	Point pointC;
	
	double sideAB;
	double sideBC;
	double sideAC;
	
	
	
	public Triangle() {

	}


	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;	
		
		sideAB = calculateSide(pointA, pointB);
		sideBC = calculateSide(pointB, pointC);
		sideAC = calculateSide(pointA, pointC);
	}


	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
		sideAB = calculateSide(this.pointA, pointB);
		sideAC = calculateSide(this.pointA, pointC);
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
		sideAB = calculateSide(pointA, this.pointB);
		sideBC = calculateSide(this.pointB, pointC);
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
		sideAC = calculateSide(pointA, this.pointC);
		sideBC = calculateSide(pointB, this.pointC);
	}


	public double getSideAB() {
		return sideAB;
	}


	public double getSideBC() {
		return sideBC;
	}


	public double getSideAC() {
		return sideAC;
	}


	private double calculateSide(Point firstPoint, Point secondPoint) {
		double side;
		double firstCathet;
		double secondCathet;
		
		firstCathet = Math.abs(firstPoint.getX() - secondPoint.getX());
		secondCathet = Math.abs(firstPoint.getY() - secondPoint.getY());
		
		side = Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2));
		
		return side;
	}
	
	
	
	
}
