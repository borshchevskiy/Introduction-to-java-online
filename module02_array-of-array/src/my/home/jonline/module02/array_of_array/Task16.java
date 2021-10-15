package my.home.jonline.module02.array_of_array;

/*
 * 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, 
 * ..., так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
 * собой. Построить такой квадрат.
 * 
 */

import java.util.Scanner;

public class Task16 {

	public static int[][] initOddOrderSquare(int n) {
		int i;
		int j;
		int[][] magicSquare;
		
		magicSquare = new int[n][n];

		// Place 1 in determined square
		i = n / 2;
		j = n - 1;

		// One by one put all values in magic square
		for (int num = 1; num <= n * n;) {
			// 3rd condition - if we get to the right upper corner
			if (i == -1 && j == n) {
				j = n - 2;
				i = 0;
			} else {
				// if next number
				// goes to out of square's right side
				if (j == n)
					j = 0;

				// if next number is
				// goes to out of square's upper side
				if (i < 0)
					i = n - 1;
			}

			// 2nd condition - if cell is occupied
			if (magicSquare[i][j] != 0) {
				j -= 2;
				i++;
				continue;
			} else
				// set number
				magicSquare[i][j] = num++;

			// 1st condition - we go up and right
			j++;
			i--;
		}

		// print magic square
		return magicSquare;
	}

	public static int[][] initEvenOrderSquare(int n) {
		int size;
		int halfN;
		int subSquareSize;
		int nColsLeft;
		int nColsRight;
		int[][] subSquare;
		int[] quadrantFactors;
		int[][] magicSquare;

		size = n * n;
		halfN = n / 2;
		subSquareSize = size / 4;

		subSquare = initOddOrderSquare(halfN);
		quadrantFactors = new int[] { 0, 2, 3, 1 };
		magicSquare = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int quadrant = (i / halfN) * 2 + (j / halfN);
				magicSquare[i][j] = subSquare[i % halfN][j % halfN];
				magicSquare[i][j] += quadrantFactors[quadrant] * subSquareSize;
			}
		}

		nColsLeft = halfN / 2;
		nColsRight = nColsLeft - 1;

		for (int i = 0; i < halfN; i++) {
			for (int j = 0; j < n; j++) {
				if (j < nColsLeft || j >= n - nColsRight || (j == nColsLeft && i == nColsLeft)) {

					if (j == 0 && i == nColsLeft)
						continue;

					int tmp = magicSquare[i][j];
					magicSquare[i][j] = magicSquare[i + halfN][j];
					magicSquare[i + halfN][j] = tmp;
				}
			}
		}
		return magicSquare;
	}

	public static int[][] initDoublyEvenOrderSquare(int n) {
		int[][] magicSquare;
		magicSquare = new int[n][n];

		// fill array with their index-counting
		// starting from 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				// filling array with its count value
				// starting from 1;
				magicSquare[i][j] = (n * i) + j + 1;
		}

		// change value of Array elements
		// at fix location as per rule
		// (n*n+1)-magicSquare[i][j]
		// Top Left corner of Matrix
		// (order (n/4)*(n/4))
		for (int i = 0; i < n / 4; i++) {
			for (int j = 0; j < n / 4; j++)
				magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
		}

		// Top Right corner of Matrix
		// (order (n/4)*(n/4))
		for (int i = 0; i < n / 4; i++) {
			for (int j = 3 * (n / 4); j < n; j++)
				magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
		}

		// Bottom Left corner of Matrix
		// (order (n/4)*(n/4))
		for (int i = 3 * n / 4; i < n; i++) {
			for (int j = 0; j < n / 4; j++)
				magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
		}

		// Bottom Right corner of Matrix
		// (order (n/4)*(n/4))
		for (int i = 3 * n / 4; i < n; i++) {
			for (int j = 3 * n / 4; j < n; j++)
				magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
		}

		// Centre of Matrix (order (n/2)*(n/2))
		for (int i = n / 4; i < 3 * n / 4; i++) {
			for (int j = n / 4; j < 3 * n / 4; j++)
				magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
		}

		// print magic square
		return magicSquare;

	}

	public static int[][] initMagicSquare(int order) {
		if (order % 2 != 0) {
			return initOddOrderSquare(order);
		} else if (order % 4 == 0) {
			return initDoublyEvenOrderSquare(order);
		} else {
			return initEvenOrderSquare(order);
		}

	}

	public static void printMagicSquare(int[][] matrix) {
		int n;

		n = matrix.length;

		System.out.println("Магичекий квадрат порядка: " + n);
		System.out.println("Сумма в каждом ряду, строке, главной и побочных диагоналях: " + n * (n * n + 1) / 2);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static int requestSquareOrder() {
		int input;
		boolean isInputOK;
		Scanner scanner;

		input = 0;
		isInputOK = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите порядок порядок магического квадрата >= 3  >> ");

		while (!isInputOK) {
			String str;
			if (scanner.hasNextInt()) {
				input = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (input < 3) {
					System.out.println("Введено неверное число!");
					System.out.print("Введите число >=3  >> ");
				} else {
					isInputOK = true; // if input is integer and positive, leave the cycle
				}
			} else {
				str = scanner.nextLine();// remove data from scanner
				System.out.println("Введено неверное число!");
				System.out.print("Введите число >=3 >> ");
			}
		}
		return input;
	}

	public static void main(String[] args) {
		printMagicSquare(initMagicSquare(requestSquareOrder()));

	}

}
