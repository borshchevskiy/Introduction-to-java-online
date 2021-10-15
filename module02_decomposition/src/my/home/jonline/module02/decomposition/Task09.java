package my.home.jonline.module02.decomposition;
/*
 *  9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y— прямой. 
 * 
 */

import java.util.Scanner;

public class Task09 {

	public static double initSide(String sideName) {

		double side;
		boolean isInputCorrect;
		Scanner scanner;

		side = 0;
		isInputCorrect = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите значение стороны " + sideName + ": ");

		while (!isInputCorrect) {
			String str;
			if (scanner.hasNextDouble()) {
				side = scanner.nextDouble();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (side <= 0) {
					System.out.println("Значение не может быть меньше или равно 0!");
					System.out.print("Введите положительное число >> ");
				} else {
					isInputCorrect = true; // if input is integer and positive, leave the cycle
				}
			} else {
				str = scanner.nextLine();// remove data from scanner
				System.out.println("Введено неверное значение!");
				System.out.print("Введите положительное число >> ");
			}
		}

		return side;
	}

	public static boolean checkIfQuadrangleExists(double x, double y, double z, double t) {

		if (z + t <= findHypothenuse(x, y)
				|| (x >= (y + z + t) | y >= (x + z + t) | z >= (x + y + t) | t >= (x + y + z))) {
			System.out.println("Четырехугольник с такими сторонами не существует!");
			return false;
		}

		return true;
	}

	public static boolean checkIfConvex() {

		Scanner scanner;
		boolean isInputCorrect;
		String str;

		scanner = new Scanner(System.in);
		isInputCorrect = false;
		str = "";

		System.out.print("Четырехугольник выпуклый? Введите \"да\" или \"нет\" >> ");

		while (!isInputCorrect) {

			if (scanner.hasNext()) {
				str = scanner.nextLine();
			}

			if (str.equals("да") || str.equals("Да") || str.equals("нет") || str.equals("Нет")) {
				isInputCorrect = true;
			} else {
				System.out.print("Введите \"да\" или \"нет\" >> ");
			}
		}

		if (str.equals("да") || str.equals("Да")) {
			return true;
		}
		return false;

	}

	public static double findTriangleSquare(double firstSide, double secondSide, double thirdSide) {
		double square;
		double halfPerimeter;

		halfPerimeter = (firstSide + secondSide + thirdSide) / 2.0;
		square = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide)
				* (halfPerimeter - thirdSide));

		return square;

	}

	public static double findRectangleTriangleSquare(double firstCathet, double secondCathet) {
		double square;

		square = 0.5 * firstCathet * secondCathet;

		return square;
	}

	public static double findHypothenuse(double firstCathet, double secondCathet) {
		double hypothenuse;

		hypothenuse = Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2));

		return hypothenuse;
	}

	public static void findQuadrangleSquare() {
		// Quadrangle with one 90 degrees angle can be divided into 2 triangles: one
		// rectangular and one not.
		// If quadrangle is convex, its square is sum of these triangles, else it equals
		// to difference of these squares.

		double sideX;
		double sideY;
		double sideZ;
		double sideT;
		double rectangleTriangleSquare;
		double triangleSquare;
		double square;
		boolean isConvex;

		System.out.println(
				"Введите значения сторон четырехугольника (стороны - X,Y,Z,T), прямой угол между сторонами X и Y.");
		sideX = initSide("X");
		sideY = initSide("Y");
		sideZ = initSide("Z");
		sideT = initSide("T");

		// Check if quadrangle with such sides exists
		while (!checkIfQuadrangleExists(sideX, sideY, sideZ, sideT)) {
			sideX = initSide("X");
			sideY = initSide("Y");
			sideZ = initSide("Z");
			sideT = initSide("T");
		}

		isConvex = checkIfConvex();

		rectangleTriangleSquare = findRectangleTriangleSquare(sideX, sideY);
		triangleSquare = findTriangleSquare(sideT, sideZ, findHypothenuse(sideX, sideY));

		if (isConvex) {
			square = rectangleTriangleSquare + triangleSquare;
		} else {
			square = rectangleTriangleSquare - triangleSquare;
		}

		System.out.println("Площадь четырехугольника с указанными сторонами: " + square);
	}

	public static void main(String[] args) {
		findQuadrangleSquare();

	}

}
