package my.home.jonline.module04.task07.main;

import my.home.jonline.module04.task07.control.Control;
import my.home.jonline.module04.task07.entity.Point;
import my.home.jonline.module04.task07.entity.Triangle;
import my.home.jonline.module04.task07.logic.Calculation;

/* Простейшие классы и объекты.
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {
		Control control = new Control();
		Calculation calculation = new Calculation();
		Triangle triangle = control.createTriangle(new Point(3, 5), new Point(65, 102), new Point(167, 43));

		System.out.println("Периметр равен: " + calculation.findPerimeter(triangle));
		System.out.println("Площадь равна: " + calculation.findSquare(triangle));

		Point medianCrossPoint;

		medianCrossPoint = calculation.findMedianCrossPoint(triangle);

		System.out.println(
				"Точка перемечения медиан: [" + medianCrossPoint.getX() + ", " + medianCrossPoint.getY() + "]");

	}

}
