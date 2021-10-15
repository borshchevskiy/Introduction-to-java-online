package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число 
 * единиц равно номеру столбца.
 * 
 */
public class Task14 {

	public static int[][] initMatrix() {
		int[][] matrix;
		int m;
		int n;
		int numberOfOnes;
		Random random;

		random = new Random();
		n = random.nextInt(10) + 2;
		m = 0;

		while (m < n) {
			m = random.nextInt(10) + 2;
		}

		matrix = new int[m][n];

		for (int i = 1; i < matrix[0].length; i++) {
			numberOfOnes = 1;

			while (numberOfOnes <= i) {
				int r = random.nextInt(matrix.length);

				if (matrix[r][i] != 1) {
					matrix[r][i] = 1;
					numberOfOnes++;
				}
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

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();

	}

}
