package my.home.jonline.module01.branch;

/*
 * 
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли 
 * он прямоугольным.
 *
 */

public class Task01 {

	public static void main(String[] args) {
		int firstAngle;
		int secondAngle;

		//generate angles
		firstAngle = 90 + (int) (Math.random() * 2);// ~50% to generate 90 degrees angle
		secondAngle = (int) (Math.random() * 180);// generates random angle from 0 to 179

		System.out.println("Первый угол = " + firstAngle);
		System.out.println("Второй угол = " + secondAngle);

		if ((firstAngle + secondAngle >= 180) || firstAngle == 0 || secondAngle == 0) {
			System.out.println("Такой треугольник не существует!");
		} else if (firstAngle == 90) {
			System.out.println("Треугольник существует и он прямоугольный!");
		} else {
			System.out.println("Треугольник существует!");
		}

	}

}
