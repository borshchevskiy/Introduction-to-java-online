package my.home.jonline.module01.branch;

/*
 * 
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через 
 * отверстие.
 *
 */

public class Task04 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;

		a = 10;
		b = 15;

		x = 18;
		y = 12;
		z = 10;

		if (((x <= a) && ((y <= b) | (z <= b))) | ((x <= b) && ((y <= a) | (z <= a)))) {
			System.out.println("Кирпич пройдет через отверстие.");
		} else if (((y <= a) && ((x <= b) | (z <= b))) | ((y <= b) && ((x <= a) | (z <= a)))) {
			System.out.println("Кирпич пройдет через отверстие.");
		} else {
			System.out.println("Кирпич не пройдет через отверстие.");
		}

	}

}
