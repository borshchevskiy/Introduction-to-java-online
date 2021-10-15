package my.home.jonline.module01.linear;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случаe.
 *  y = [-3; 0] при x = [-4; 4];
 *  y = [-3; 4] при x = [-2; 2]; 
 */

public class Task06 {

	public static void main(String[] args) {
		double x;
		double y;
		boolean result;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите значение координаты x");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		x = scanner.nextDouble();

		System.out.println("Введите значение координаты y");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		y = scanner.nextDouble();

		result = ((-3 <= y) && (y <= 0) && (-4 <= x) && (x <= 4)) || ((0 <= y) && (y <= 4) && (-2 <= x) && (x <= 2));

		System.out.println(result);

	}

}
