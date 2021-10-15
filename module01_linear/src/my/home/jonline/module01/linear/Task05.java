package my.home.jonline.module01.linear;

/*
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести 
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task05 {

	public static void main(String[] args) {

		int t;
		int hours;
		int minutes;
		int seconds;

		t = 3661;

		seconds = t % 60;

		minutes = (t / 60) % 60;

		hours = t / 3600;

		System.out.println(hours + "ч" + minutes + "мин" + seconds + "c");

	}

}
