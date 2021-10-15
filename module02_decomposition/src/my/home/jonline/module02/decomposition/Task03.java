package my.home.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади 
 * треугольника.
 * 
 */
public class Task03 {

	public static double triangleSquare(double side) {
		double square;

		square = Math.sqrt(3) / 4 * side * side;

		return square;
	}

	public static double hexagonSquare(double side) {
		double square;

		square = 6 * triangleSquare(side);
		System.out.println("Площадь правильного шестиугольника со стороной " + side + " равна: ");

		return square;
	}

	public static double initSide() {
		double side;
		boolean isInputCorrect;
		Scanner scanner;

		side = 0;
		isInputCorrect = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите значение стороны правильного шестиугольника: ");

		while (!isInputCorrect) {
			String str;
			if (scanner.hasNextDouble()) {
				side = scanner.nextDouble();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (side <= 0) {
					System.out.println("Длина стороны не может быть меньше или равна 0!");
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

	public static void main(String[] args) {
		System.out.println(hexagonSquare(initSide()));

	}

}
