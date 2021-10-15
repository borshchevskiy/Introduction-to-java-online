package my.home.jonline.module02.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими 
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 * 
 */

public class Task04 {

	public static int initNumberOfPoints() {
		int number;
		boolean isInputCorrect;
		Scanner scanner;

		number = 0;
		isInputCorrect = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите количество точек на плоскости: ");

		while (!isInputCorrect) {
			String str;
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (number <= 0) {
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

		return number;
	}

	public static double[][] initCoordinates(int numberOfPoints) {
		double[][] coordinates;
		Random random;

		coordinates = new double[numberOfPoints][2];
		random = new Random();

		for (int i = 0; i < coordinates.length; i++) {
			coordinates[i][0] = random.nextDouble() * 100.0;
			coordinates[i][1] = random.nextDouble() * 100.0;
		}

		System.out.println();
		for (int i = 0; i < coordinates.length; i++) {
			System.out.println("Точка " + (i + 1) + ": " + Arrays.toString(coordinates[i]));
		}

		return coordinates;
	}

	public static void findLongestDistance(double[][] coordinates) {
		double maxDistance;
		int firstPoint;
		int secondPoint;

		firstPoint = 0;
		secondPoint = 0;
		maxDistance = 0;

		System.out.println();
		for (int i = 0; i < coordinates.length - 1; i++) {
			for (int j = i + 1; j < coordinates.length; j++) {
				double distance = Math.sqrt(Math.abs(Math.pow((coordinates[i][0] - coordinates[j][0]), 2)
						- Math.pow((coordinates[i][1] - coordinates[j][1]), 2)));
				if (distance > maxDistance) {
					maxDistance = distance;
					firstPoint = i + 1;
					secondPoint = j + 1;
				}
				System.out.println("Расстояние между точками " + (i + 1) + " и " + (j + 1) + " равно: " + distance);
			}
		}

		System.out.println();
		System.out.println("Максимальное расстояние между точками " + firstPoint + " и " + secondPoint + ", оно равно: "
				+ maxDistance);

	}

	public static void main(String[] args) {
		findLongestDistance(initCoordinates(initNumberOfPoints()));
		

	}

}
