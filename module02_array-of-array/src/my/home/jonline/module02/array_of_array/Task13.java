package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * 
 */


public class Task13 {

	public static int[][] initMatrix() {
		int[][] matrix;
		Random random;

		random = new Random();
		matrix = new int[10][10];

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

	public static void sortMatrixColumnsAscending(int[][] matrix) {
		int max;

		for (int k = 0; k < matrix[0].length; k++) {
			for (int i = 0; i < matrix.length; i++) {
				max = matrix[0][i];
				for (int j = 0; j < matrix[i].length - 1; j++) {
					if (matrix[j][i] > matrix[j + 1][i]) {
						max = matrix[j][i];
						matrix[j][i] = matrix[j + 1][i];
						matrix[j + 1][i] = max;
					}
				}
			}
		}
	}
	
	public static void sortMatrixColumnsDescending(int[][] matrix) {
		int min;

		for (int k = 0; k < matrix[0].length; k++) {
			for (int i = 0; i < matrix.length; i++) {
				min = matrix[0][i];
				for (int j = 0; j < matrix[i].length - 1; j++) {
					if (matrix[j][i] < matrix[j + 1][i]) {
						min = matrix[j][i];
						matrix[j][i] = matrix[j + 1][i];
						matrix[j + 1][i] = min;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();
		
		System.out.println("Столбцы отсортированы по возрастанию: ");
		sortMatrixColumnsAscending(matrix);
		printMatrix(matrix);
		System.out.println();
		
		System.out.println("Столбцы отсортированы по убыванию: ");
		sortMatrixColumnsDescending(matrix);
		printMatrix(matrix);

	}

}
