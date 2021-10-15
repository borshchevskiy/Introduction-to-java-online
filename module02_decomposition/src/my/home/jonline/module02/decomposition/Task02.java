package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * 
 */
public class Task02 {

	public static int initVar() {

		int result;
		Random random;

		random = new Random();
		result = 1 + random.nextInt(1000);

		System.out.print(" " + result);
		return result;
	}

	public static int findGreatestCommonDivisor(int a, int b) {

		if (a == b) {
			return a;
		}

		if (a > b) {
			return euclidAlgorithm(a, b);
		}
		return euclidAlgorithm(b, a);
	}

	public static int euclidAlgorithm(int a, int b) {
		/*
		 * a = b * q + r; gcd(a, b) = gcd(b, r); gcd(r, 0) = r;
		 * 
		 */

		int gcd;
		int r;
		int q;

		gcd = 0;
		q = 1;

		while (gcd == 0) {
			r = a - b * q;
			q++;
			if (r == 0) {
				gcd = b;
			} else if (r >= b) {
				continue;
			} else {
				gcd = euclidAlgorithm(b, r);
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		System.out.println("Наибольший общий делитель чисел 36, 78, 294, 570: "
				+ findGreatestCommonDivisor(78, findGreatestCommonDivisor(294, findGreatestCommonDivisor(570, 36))));
		System.out.println();

		System.out.print("Наибольший общий делитель чисел");
		System.out.println(": " + findGreatestCommonDivisor(initVar(),
				findGreatestCommonDivisor(initVar(), findGreatestCommonDivisor(initVar(), initVar()))));

	}

}
