package my.home.jonline.module01.loop;

/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task04 {

	public static void main(String[] args) {
		long result;
		long nextResult;

		result = 1;

		for (long i = 2; i <= 200; i++) {
			nextResult = result * (long) Math.pow(i, 2);
			if (nextResult <= 0) {
				System.out.println("Достигнуто максимальное значение для вычисления!");
				System.out.println("Произведение квадратов чисел от 1 до " + i + ": " + result);
				break;
			}
			result = nextResult;
		}

	}

}
