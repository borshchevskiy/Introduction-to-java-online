package my.home.jonline.module01.loop;

/*
 *  8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task08 {

	public static void main(String[] args) {
		int a;
		int b;
		int number;
		int temp;

		a = 123456;
		b = 456789;

		while (a != 0) {
			number = a % 10;
			a = a / 10;
			temp = b;
			while (temp != 0) {
				if (temp % 10 == number) {
					System.out.println("Цифра " + number + " пристствует в обоих числах.");
				}
				temp = temp / 10;
			}

		}

	}

}
