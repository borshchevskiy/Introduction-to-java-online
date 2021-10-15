package my.home.jonline.module01.branch;


/*
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 *
 */

public class Task03 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;

		double y1;
		double y2;
		double y3;

		double firstSecondTan; // tangent of the first and second points
		double firstThirdTan; // tangent of the first and third points

		x1 = 6;
		x2 = -3;
		x3 = 9;

		y1 = 8;
		y2 = -4;
		y3 = 12;

		firstSecondTan = (y1 - y2) / (x1 - x2);
		firstThirdTan = (y1 - y3) / (x1 - x3);

		if (firstSecondTan == firstThirdTan) {
			System.out.println("Точки лежат на одной прямой.");
		} else {
			System.out.println("Точки не лежат на одной прямой.");
		}

	}

}
