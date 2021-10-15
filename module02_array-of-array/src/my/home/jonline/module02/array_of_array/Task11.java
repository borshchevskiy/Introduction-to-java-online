package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в 
 * которых число 5 встречается три и более раз.
 * 
 */

public class Task11 {

	public static int[][] initMatrix() {
		int[][] matrix;
		Random random;

		random = new Random();
		matrix = new int[10][20];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(16);

			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void findStrings(int[][] matrix) {
		int count;
		boolean isLineFound;

		isLineFound = false;
		System.out.println("Номера строк, в которых число 5 встречается три и более раз: ");

		for (int i = 0; i < matrix.length; i++) {
			count = 0;

			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print(i + " ");
				isLineFound = true;
			}
		}
		if (!isLineFound) {
			System.out.println("Строки не найдены.");
		}
	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();
		findStrings(matrix);
	}

}
