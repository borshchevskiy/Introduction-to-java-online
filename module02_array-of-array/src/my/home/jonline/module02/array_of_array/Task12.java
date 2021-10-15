package my.home.jonline.module02.array_of_array;

import java.util.Arrays;
import java.util.Random;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов. 
 */

public class Task12 {

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

	public static void sortMatrixLines(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);
		}
	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();
		
		System.out.println("Модифицированная матрица:");
		sortMatrixLines(matrix);
		printMatrix(matrix);
	}

}
