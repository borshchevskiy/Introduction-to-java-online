package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * 
 * A[i, j] = sin(((I^2) - (J^2)) / N)
 * 
 */
public class Task07 {

	public static double[][] initMatrix() {
		double[][] matrix;
		int n;
		Random random;

		random = new Random();
		n = (1 + random.nextInt(5)) * 2;
		matrix = new double[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
			}
		}
		return matrix;
	}

	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.printf("%.3f  ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		double[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);

	}

}
